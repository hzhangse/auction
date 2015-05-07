package com.train.auction.business;

import java.io.Serializable;
import java.util.Date;


public class BidBean implements Serializable
{
	private Integer id;
	private String user;
	private String item;
	private double price;
	private Date bidDate;


	//�޲����Ĺ�����
	public BidBean()
	{
	}
	//��ʼ��ȫ�����ԵĹ�����
	public BidBean(Integer id , String user , String item ,
		double price , Date bidDate)
	{
		this.id = id;
		this.user = user;
		this.item = item;
		this.price = price;
		this.bidDate = bidDate;
	}

	//id���Ե�setter��getter����
	public void setId(Integer id)
	{
		this.id = id;
	}
	public Integer getId()
	{
		return this.id;
	}

	//user���Ե�setter��getter����
	public void setUser(String user)
	{
		this.user = user;
	}
	public String getUser()
	{
		return this.user;
	}

	//item���Ե�setter��getter����
	public void setItem(String item)
	{
		this.item = item;
	}
	public String getItem()
	{
		return this.item;
	}

	//price���Ե�setter��getter����
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return this.price;
	}

	//bidDate���Ե�setter��getter����
	public void setBidDate(Date bidDate)
	{
		this.bidDate = bidDate;
	}
	public Date getBidDate()
	{
		return this.bidDate;
	}

}