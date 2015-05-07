package com.train.auction.dao.impl;

import java.util.*;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.train.auction.business.*;
import com.train.auction.dao.*;
import com.train.auction.model.*;


public class BidDaoHibernate 
	extends HibernateDaoSupport implements BidDao  
{
	/**
	 * �����������Ҿ��ۼ�¼
	 * @param bidId ����id;
	 * @return id��Ӧ�ľ��ۼ�¼
	 */
	public Bid get(Integer bidId)
	{
		return(Bid)getHibernateTemplate().get(Bid.class , bidId);
	}

	/**
	 * ���澺�ۼ�¼
	 * @param bid ��Ҫ����ľ��ۼ�¼
	 */
	public void save(Bid bid)
	{
		getHibernateTemplate().save(bid);
	}

	/**
	 * �޸ľ��ۼ�¼
	 * @param bid ��Ҫ�޸ĵľ��ۼ�¼
	 */
	public void update(Bid bid)
	{
		getHibernateTemplate().saveOrUpdate(bid);
	}

	/**
	 * ɾ�����ۼ�¼
	 * @param id ��Ҫɾ���ľ���id
	 */
	public void delete(Integer id)
	{
		getHibernateTemplate().delete(get(id));
	}

	/**
	 * ɾ������
	 * @param bid ��Ҫɾ���ľ���
	 */
	public void delete(Bid bid)
	{
		getHibernateTemplate().delete(bid);
	}

	/**
	 * �����û����Ҿ���
	 * @param id �û�id
	 * @return �û���Ӧ��ȫ��
	 * @return �û���Ӧ��ȫ������
	 */
	public List<Bid> findByUser(Integer userId)
	{
		return (List<Bid>)getHibernateTemplate()
			.find("from Bid as bid where bid.bidUser.id = ?" , userId);
	}
	/**
	 * ������Ʒid���Լ����۲�ѯ�û�
	 * @param itemId ��Ʒid;
	 * @param price ���۵ļ۸�
	 * @return ��ָ����Ʒ��ָ�����۶�Ӧ���û�
	 */
	public AuctionUser findUserByItemAndPrice(Integer itemId , Double price)
	{
		//ִ��HQL��ѯ
		List<Bid> l = (List<Bid>)getHibernateTemplate()
			.find("from Bid as bid where bid.bidItem.id = ? and bid.bidPrice = ?"
			, new Object[]{itemId , price});
		//���ز�ѯ�õ��ĵ�һ��Bid���������AuctionUser����
		if (l.size() >= 1)
		{
			Bid b = (Bid)l.get(0);
			return b.getBidUser();
		}
		return null;
	}
}