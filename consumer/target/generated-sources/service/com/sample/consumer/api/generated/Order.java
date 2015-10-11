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

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Generated dto.
 */
@javax.annotation.Generated(value = "hybris", date = "Sun Oct 11 17:25:48 CEST 2015")
@XmlRootElement
@JsonAutoDetect(isGetterVisibility = Visibility.NONE, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE,
		creatorVisibility = Visibility.NONE, fieldVisibility = Visibility.NONE)
public class Order
{

	@com.fasterxml.jackson.annotation.JsonProperty(value="productid")
	@javax.validation.constraints.NotNull
	private java.lang.String _productid;

	@com.fasterxml.jackson.annotation.JsonProperty(value="productquantity")
	@javax.validation.constraints.NotNull
	private java.lang.Object _productquantity;

	@com.fasterxml.jackson.annotation.JsonProperty(value="userid")
	@javax.validation.constraints.NotNull
	private java.lang.String _userid;

	@com.fasterxml.jackson.annotation.JsonProperty(value="createdAt")
	private java.util.Date _createdAt;
	
	public java.lang.String getProductid()
	{
		return _productid;
	}
	
	public java.lang.Object getProductquantity()
	{
		return _productquantity;
	}
	
	public java.lang.String getUserid()
	{
		return _userid;
	}
	
	public java.util.Date getCreatedAt()
	{
		return _createdAt;
	}

	public void setProductid(final java.lang.String _productid)
	{
		this._productid = _productid;
	}

	public void setProductquantity(final java.lang.Object _productquantity)
	{
		this._productquantity = _productquantity;
	}

	public void setUserid(final java.lang.String _userid)
	{
		this._userid = _userid;
	}

	public void setCreatedAt(final java.util.Date _createdAt)
	{
		this._createdAt = _createdAt;
	}
}
