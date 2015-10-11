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

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

@Ignore
public final class DefaultOrdersResourceTest extends com.sample.consumer.api.generated.AbstractResourceTest
{
	/**
	 * Server side root resource /orders,
	 * evaluated with some default value(s).
	 */
	private static final String ROOT_RESOURCE_PATH = "/orders";

	/* get() /orders */
	@Test
	public void testGet()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* get() /orders/orderId */
	@Test
	public void testGetByOrderId()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/orderId");

		final Response response = target.request().get();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* put(entity) /orders/orderId */
	@Test
	public void testPutByOrderIdWithOrder()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/orderId");
		final Order entityBody =
		new Order();
		final javax.ws.rs.client.Entity<Order> entity =
		javax.ws.rs.client.Entity.entity(entityBody,"application/json");

		final Response response = target.request().put(entity);

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.OK.getStatusCode(), response.getStatus());
	}

	/* delete() /orders/orderId */
	@Test
	public void testDeleteByOrderId()
	{
		final WebTarget target = getRootTarget(ROOT_RESOURCE_PATH).path("/orderId");

		final Response response = target.request().delete();

		Assert.assertNotNull("Response must not be null", response);
		Assert.assertEquals("Response does not have expected response code", Status.NO_CONTENT.getStatusCode(), response.getStatus());
	}

	@Override
	protected ResourceConfig configureApplication()
	{
		final ResourceConfig application = new ResourceConfig();
		application.register(DefaultOrdersResource.class);
		return application;
	}
}
