package com.train.auction.model;

import java.util.*;

public class State
{
	//��ʶ����
	private Integer id;
	//��Ʒ��״̬��
	private String stateName;
	//��״̬�µ�������Ʒ
	private Set<Item> items = new HashSet<Item>();

	//�޲����Ĺ�����
	public State()
	{
	}
	//��ʼ��ȫ���������ԵĹ�����
	public State(Integer id , String stateName)
	{
		this.id = id;
		this.stateName = stateName;
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

	//stateName���Ե�setter��getter����
	public void setStateName(String stateName)
	{
		this.stateName = stateName;
	}
	public String getStateName()
	{
		return this.stateName;
	}

	//items���Ե�setter��getter����
	public void setItems(Set<Item> items)
	{
		this.items = items;
	}
	public Set<Item> getItems()
	{
		return this.items;
	}
}