package com.train.auction.service;

import java.util.List;

import com.train.auction.business.*;
import com.train.auction.dao.*;
import com.train.auction.exception.AuctionException;


public interface AuctionManager  
{
	/**
	 * ����Ӯȡ�߲�ѯ��Ʒ
	 * @param winerId Ӯȡ�ߵ�ID
	 * @return Ӯȡ�߻�õ�ȫ����Ʒ
	 */
	List<ItemBean> getItemByWiner(Integer winerId) 
		throws AuctionException;

	/**
	 * ��ѯ���ĵ�ȫ����Ʒ
	 * @return ȫ��������Ʒ
	 */
	List<ItemBean> getFailItems()throws AuctionException;

	/**
	 * �����û�����������֤��¼�Ƿ�ɹ�
	 * @param username ��¼���û���
 	 * @param pass ��¼������
	 * @return ��¼�ɹ������û�ID�����򷵻�-1
	 */
	int validLogin(String username , String pass)
		throws AuctionException;

	/**
	 * ��ѯ�û���ȫ������
	 * @param userId �����û���ID
	 * @return �û���ȫ������
	 */
	List<BidBean> getBidByUser(Integer userId)
		throws AuctionException;

	/**
	 * �����û�����Ŀǰ���������е�ȫ����Ʒ
	 * @param userId �����ߵ�ID
	 * @return ���ڵ�ǰ�û��ġ����������е�ȫ����Ʒ��
	 */
	List<ItemBean> getItemsByOwner(Integer userId)
		throws AuctionException;

	/**
	 * ��ѯȫ������
	 * @return ϵͳ��ȫ��ȫ������
	 */
	List<KindBean> getAllKind() throws AuctionException; 

	/**
	* ������Ʒ
	* @param name ��Ʒ����
	* @param desc ��Ʒ����
	* @param remark ��Ʒ��ע
	* @param avail ��Ч����
	* @param kind ��Ʒ����
	* @param userId �����ߵ�ID
	* @return ������Ʒ������
	*/ 
	int addItem(String name , String desc , String remark , 
		double initPrice , int avail , int kind , Integer userId) 
		throws AuctionException;

	/**
	 * ��������
	 * @param name ��������
	 * @param desc ��������
	 * @return �������������
	 */ 
	int addKind(String name , String desc) throws AuctionException;

	/**
	 * ���ݲ�Ʒ���࣬��ȡ���������е�ȫ����Ʒ
	 * @param kindId ����id;
	 * @return �����ȫ����Ʒ
	 */
	List<ItemBean> getItemsByKind(int kindId) throws AuctionException;

	/**
	 * ��������id��ȡ������
	 * @param kindId ����id;
	 * @return �����������
	 */
	String getKind(int kindId) throws AuctionException;

	/**
	 * ������Ʒid����ȡ��Ʒ
	 * @param itemId ��Ʒid;
	 * @return ָ��id��Ӧ����Ʒ
	 */
	ItemBean getItem(int itemId) throws AuctionException;

	/**
	 * �����µľ��ۣ����Ծ����û����ʼ�֪ͨ
	 * @param itemId ��Ʒid;
	 * @param bidPrice ���ۼ۸�
	 * @param userId �����û���ID
	 * @return �����������ۼ�¼��ID
	 */
	int addBid(int itemId , double bidPrice ,Integer userId)
		throws AuctionException;

	/**
	 * ����ʱ�����޸���Ʒ��Ӯȡ��
	 */
	void updateWiner()throws AuctionException;
}