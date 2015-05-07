package com.train.auction.dao;

import java.util.List;

import com.train.auction.business.*;
import com.train.auction.model.*;


public interface AuctionUserDao  
{
	/**
	 * ����id�����û�
	 * @param id ��Ҫ���ҵ��û�id
	 */
	AuctionUser get(Integer id);
	
	/**
	 * �����û�
	 * @param user ��Ҫ���ӵ��û�
	 */
	void save(AuctionUser user);

	/**
	 * �޸��û�
	 * @param user ��Ҫ�޸ĵ��û�
	 */
	void update(AuctionUser user);

	/**
	 * ɾ���û�
	 * @param id ��Ҫɾ�����û�id
	 */  
	void delete(Integer id);

	/**
	 * ɾ���û�
	 * @param user ��Ҫɾ�����û�
	 */
	void delete(AuctionUser user);

	/**
	 * ��ѯȫ���û�
 	 * @return ���ȫ���û�
	 */
	List<AuctionUser> findAll();

	/**
	 * �����û�������������û�
	 * @param username ��ѯ������û���
	 * @param pass ��ѯ���������
	 * @return ָ���û����������Ӧ���û�
	 */
	AuctionUser findUserByNameAndPass(String username , String pass);
}