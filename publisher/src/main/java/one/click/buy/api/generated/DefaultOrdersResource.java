/*
 * [y] hybris Platform
 * 
 * Copyright (c) 2000-2015 hybris AG
 * All rights reserved.
 * 
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package one.click.buy.api.generated;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.inject.Singleton;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.sap.cloud.yaas.api.HybrisPubSubServiceApiClient;
import com.sap.cloud.yaas.servicesdk.authorization.AuthorizationScope;
import com.sap.cloud.yaas.servicesdk.authorization.integration.AuthorizedExecutionTemplate;

/**
 * Resource class containing the custom logic. Please put your logic here!
 */
@Component("apiOrdersResource")
@Singleton
public class DefaultOrdersResource implements
		one.click.buy.api.generated.OrdersResource {
	@javax.ws.rs.core.Context
	private javax.ws.rs.core.UriInfo uriInfo;

	@Autowired
	private AuthorizedExecutionTemplate authorizedExecutionTemplate;

	private HybrisPubSubServiceApiClient pubSub = new HybrisPubSubServiceApiClient(
			"https://api.yaas.io/hybris/pubsub/b2");

	@Override
	public Response post(YaasAwareParameters yaasAware, String productid,
			String productquantity, String userid, String createdAt) {

		Order order = new Order();
		order.setCreatedAt(new Date(Long.valueOf(createdAt)));

		order.setProductid(productid);
		order.setProductquantity(productquantity);
		order.setUserid(userid);

		// covert order to json
		ObjectWriter ow = new ObjectMapper().writer()
				.withDefaultPrettyPrinter();

		Map<String, Object> hash = new HashMap<String, Object>();
		try {
			hash.put("payload", ow.writeValueAsString(order));
		} catch (JsonProcessingException e) {
		}

		Response response = authorizedExecutionTemplate.executeAuthorized(
				new AuthorizationScope(null, Arrays.asList()),
				null,
				(token) -> pubSub
						.topics()
						.topicOwnerClientEventType("dash7.dash7app",
								"consumer-test-event2").publish().preparePost()
						.withAuthorization(token.toAuthorizationHeaderValue())
						.withPayload(hash).execute()

		);

		return response;
	}
}
