package com.train.auction.dao;

import java.util.List;

import com.train.auction.business.*;
import com.train.auction.model.*;

public interface StateDao  
{
	/**
	 * ����id����״̬
	 * @param id ��Ҫ���ҵ�״̬id
	 */ 
	State get(Integer id);

	/**
	 * ����״̬
	 * @param state ��Ҫ���ӵ�״̬
	 */      
	void save(State state);

	/**
	 * �޸�״̬
	 * @param state ��Ҫ�޸ĵ�״̬
	 */
	void update(State state);

	/**
	 * ɾ��״̬
	 * @param id ��Ҫɾ����״̬id
	 */ 
	void delete(Integer id);

	/**
	 * ɾ��״̬
	 * @param state ��Ҫɾ����״̬
	 */
	void delete(State state);

	/**
	 * ��ѯȫ��״̬
	 * @return ���ȫ��״̬
	 */ 
	List<State> findAll();
}
