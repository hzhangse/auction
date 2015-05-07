package com.train.auction.dao.impl;

import java.util.*;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.train.auction.business.*;
import com.train.auction.dao.*;
import com.train.auction.model.*;


public class ItemDaoHibernate
	extends HibernateDaoSupport implements ItemDao  
{
	/**
	 * ��������������Ʒ
	 * @param itemId ����ҵ���Ʒ��id;
	 * @return id��Ӧ����Ʒ
	 */
	public Item get(Integer itemId)
	{
		return (Item)getHibernateTemplate().get(Item.class , itemId);
	}

	/**
	 * ������Ʒ
	 * @param item ��Ҫ�������Ʒ
	 */
	public void save(Item item)
	{
		getHibernateTemplate().save(item);
	}

	/**
	 * �޸���Ʒ
	 * @param item ��Ҫ�޸ĵ���Ʒ
	 */
	public void update(Item item)
	{
		getHibernateTemplate().saveOrUpdate(item);
	}

	/**
	 * ɾ����Ʒ
	 * @param id ��Ҫɾ������Ʒid
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate().delete(get(id));
	}

	/**
	 * ɾ����Ʒ
	 * @param item ��Ҫɾ������Ʒ
	 */
	public void delete(Item item)
	{
		getHibernateTemplate().delete(item);
	}

	/**
	 * ���ݲ�Ʒ���࣬��ȡ��ǰ������ȫ����Ʒ
	 * @param kindId ����id;
	 * @return �����ȫ����Ʒ
	 */
	public List<Item> findItemByKind(Integer kindId)
	{
		return (List<Item>)getHibernateTemplate()
			.find("from Item as i where i.kind.id = ? and i.itemState.id = 1"
			, kindId);
	}

	/**
	 * ���������߲��Ҵ��������е���Ʒ
	 * @param useId ������Id;
	 * @return ָ���û����������е�ȫ����Ʒ
	 */
	public List<Item> findItemByOwner(Integer userId)
	{
		return (List<Item>)getHibernateTemplate()
			.find("from Item as i where i.owner.id = ? and i.itemState.id = 1"
			, userId);
	}

	/**
	 * ����Ӯȡ�߲�����Ʒ
	 * @param userId Ӯȡ��Id;
	 * @return ָ���û�Ӯȡ��ȫ����Ʒ
	 */
	public List<Item> findItemByWiner(Integer userId)
	{
		return (List<Item>)getHibernateTemplate()
			.find("from Item as i where i.winer.id = ? and i.itemState.id = 2"
			,userId);
	}

	/**
	 * ������Ʒ״̬������Ʒ
	 * @param stateId ״̬Id;
	 * @return ��״̬�µ�ȫ����Ʒ
	 */
	public List<Item> findItemByState(Integer stateId)
	{
		return (List<Item>)getHibernateTemplate()
			.find("from Item as i where i.itemState.id = ?" , stateId);
	}
}