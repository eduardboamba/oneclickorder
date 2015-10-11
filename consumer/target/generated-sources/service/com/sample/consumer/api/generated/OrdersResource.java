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

import javax.ws.rs.core.Response;

@javax.ws.rs.Path("/orders")
public interface OrdersResource
{
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response get(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware);

	@javax.ws.rs.Path("/{orderId}")
	@javax.ws.rs.GET
	@javax.ws.rs.Produces({"application/json"})
	Response getByOrderId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("orderId") final java.lang.String orderId);

	@javax.ws.rs.Path("/{orderId}")
	@javax.ws.rs.PUT
	@javax.ws.rs.Consumes({"application/json"})
	Response putByOrderId(@javax.ws.rs.PathParam("orderId") final java.lang.String orderId, @javax.validation.Valid final Order order);

	@javax.ws.rs.Path("/{orderId}")
	@javax.ws.rs.DELETE
	Response deleteByOrderId(@javax.ws.rs.BeanParam @javax.validation.Valid final YaasAwareParameters yaasAware, @javax.ws.rs.PathParam("orderId") final java.lang.String orderId);

}
