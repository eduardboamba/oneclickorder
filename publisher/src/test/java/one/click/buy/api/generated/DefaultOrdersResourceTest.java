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

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.server.ResourceConfig;
import org.junit.Assert;
import org.junit.Test;


public final class DefaultOrdersResourceTest extends one.click.buy.api.generated.AbstractResourceTest
{
	/**
	 * Server side root resource /orders,
	 * evaluated with some default value(s).
	 */
	private static final String ROOT_RESOURCE_PATH = "/orders";

	/* post(null) /orders */


	@Override
	protected ResourceConfig configureApplication()
	{
		final ResourceConfig application = new ResourceConfig();
		application.register(DefaultOrdersResource.class);
		return application;
	}
}
