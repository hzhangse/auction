package com.train.auction.exception;


public class AuctionException extends RuntimeException
{
	//����һ���޲����Ĺ�����
	public AuctionException()
	{
	}
	//����һ����message�����Ĺ������
	public AuctionException(String message)
	{
		super(message);
	}
}
