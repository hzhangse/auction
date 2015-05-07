package com.train.auction.dao;

import java.util.List;

import com.train.auction.business.*;
import com.train.auction.model.*;

public interface KindDao  
{
	/**
	 * ����id��������
	 * @param id ��Ҫ���ҵ������id
	 */
	Kind get(Integer id);

	/**
	 * ��������
	 * @param kind ��Ҫ���ӵ�����
	 */
	void save(Kind kind);

	/**
	 * �޸�����
	 * @param kind ��Ҫ�޸ĵ�����
	 */
	void update(Kind kind);

	/**
	 * ɾ������
	 * @param id ��Ҫɾ��������id
	 */
	void delete(Integer id);

	/**
	 * ɾ������
	 * @param kind ��Ҫɾ��������
	 */
	void delete(Kind kind);

	/**
	 * ��ѯȫ������
	 * @return ���ȫ������
	 */
	List<Kind> findAll();
}
