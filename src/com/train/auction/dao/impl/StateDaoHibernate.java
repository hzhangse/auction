package com.train.auction.dao.impl;

import java.util.*;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.hibernate.Hibernate;

import com.train.auction.business.*;
import com.train.auction.dao.*;
import com.train.auction.model.*;


public class StateDaoHibernate
	extends HibernateDaoSupport implements StateDao  
{
	/**
	 * ����id����״̬
	 * @param id ��Ҫ���ҵ�״̬id
	 */
	public State get(Integer id)
	{
		return (State)getHibernateTemplate().get(State.class , id);
	}
	/**
	 * ����״̬
	 * @param state ��Ҫ���ӵ�״̬
	 */  
	public void save(State state)
	{
		getHibernateTemplate().save(state);
	}

	/**
	 * �޸�״̬
	 * @param state ��Ҫ�޸ĵ�״̬
	 */
	public void update(State state)
	{
		getHibernateTemplate().saveOrUpdate(state);
	}

	/**
	 * ɾ��״̬
	 * @param id ��Ҫɾ����״̬id
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate().delete(get(id));
	}

	/**
	 * ɾ��״̬
	 * @param state ��Ҫɾ����״̬
	 */
	public void delete(State state)
	{
		getHibernateTemplate().delete(state);
	}

	/**
	 * ��ѯȫ��״̬
	 * @return ���ȫ��״̬
	 */
	public List<State> findAll()
	{
		return (List<State>)getHibernateTemplate().find("from State");
	}
}