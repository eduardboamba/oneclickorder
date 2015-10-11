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
package com.sample.consumer.api.generated;

import java.util.Arrays;
import java.util.HashMap;

import javax.inject.Singleton;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sap.cloud.yaas.api.HybrisPubSubServiceApiClient;
import com.sap.cloud.yaas.servicesdk.authorization.AuthorizationScope;
import com.sap.cloud.yaas.servicesdk.authorization.integration.AuthorizedExecutionTemplate;

/**
 * Resource class containing the custom logic. Please put your logic here!
 */
@Component("apiOrdersResource")
@Singleton
public class DefaultOrdersResource implements
		com.sample.consumer.api.generated.OrdersResource {
	@Autowired
	private AuthorizedExecutionTemplate authorizedExecutionTemplate;

	/* GET / */
	@Override
	public Response get(final YaasAwareParameters yaasAware) {
		HybrisPubSubServiceApiClient client = new HybrisPubSubServiceApiClient(
				HybrisPubSubServiceApiClient.DEFAULT_BASE_URI);
		Response response = (Response) authorizedExecutionTemplate
				.executeAuthorized(
						new AuthorizationScope(
								null,
								Arrays.asList("hybris.pubsub.topic=hybris.order.order-updated")),
						null,
						(token) -> client
								.topics()
								.topicOwnerClientEventType("dash7.dash7app",
										"consumer-test-event2")
								.read()
								.preparePost()
								.withPayload(Entity.json(new HashMap()))
								.withAuthorization(
										token.toAuthorizationHeaderValue())
								.execute());

		if (response.getStatus() == Status.OK.getStatusCode()) {
			
		}

		return Response.ok().entity(new java.util.ArrayList<Order>()).build();
	}

	/* GET /{orderId} */
	@Override
	public Response getByOrderId(final YaasAwareParameters yaasAware,
			final java.lang.String orderId) {
		// place some logic here
		return Response.ok().entity(new Order()).build();
	}

	/* PUT /{orderId} */
	@Override
	public Response putByOrderId(final java.lang.String orderId,
			final Order order) {
		// place some logic here
		return Response.ok().build();
	}

	/* DELETE /{orderId} */
	@Override
	public Response deleteByOrderId(final YaasAwareParameters yaasAware,
			final java.lang.String orderId) {
		// place some logic here
		return Response.noContent().build();
	}

}
