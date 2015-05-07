package com.train.auction.dao.impl;

import java.util.*;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.train.auction.business.*;
import com.train.auction.dao.*;
import com.train.auction.model.*;


public class KindDaoHibernate 
	extends HibernateDaoSupport implements KindDao  
{
	/**
	 * ����id��������
	 * @param id ��Ҫ���ҵ������id
	 */
	public Kind get(Integer id)
	{
		return (Kind)getHibernateTemplate().get(Kind.class , id);
	}

	/**
	 * ��������
	 * @param kind ��Ҫ���ӵ�����
	 */
	public void save(Kind kind)
	{
		getHibernateTemplate().save(kind);  
	}

	/**
	 * �޸�����
	 * @param kind ��Ҫ�޸ĵ�����
	 */ 
	public void update(Kind kind)
	{
		getHibernateTemplate().saveOrUpdate(kind);  
	}

	/**
	 * ɾ������
	 * @param id ��Ҫɾ��������id
	 */ 
	public void delete(Integer id)
	{
		getHibernateTemplate().delete(get(id));  
	}

	/**
	 * ɾ������
	 * @param kind ��Ҫɾ��������
	 */
	public void delete(Kind kind)
	{
		getHibernateTemplate().delete(kind);  
	}

	/**
	 * ��ѯȫ������
	 * @return ���ȫ������
	 */
	public List<Kind> findAll()
	{
		return (List<Kind>)getHibernateTemplate().find("from Kind");
	}
}
