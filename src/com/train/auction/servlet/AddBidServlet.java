package com.train.auction.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;

import org.json.*;

import com.train.auction.service.AuctionManager;
import com.train.auction.servlet.base.BaseServlet;


@WebServlet(urlPatterns="/android/addBid.jsp")
public class AddBidServlet extends BaseServlet
{
    public void service(HttpServletRequest request , 
		HttpServletResponse response)
		throws IOException , ServletException
	{
		// ��ȡuserId
		Integer userId = (Integer)request.getSession(true)
			.getAttribute("userId");
		request.setCharacterEncoding("gbk");
		// ��ȡ�������
		String itemId = request.getParameter("itemId");
		String bidPrice = request.getParameter("bidPrice");
		// ��ȡҵ���߼����
		AuctionManager auctionManager = (AuctionManager)getCtx().getBean("mgr");
		// ����ҵ�񷽷�����Ӿ���
		int bidId = auctionManager.addBid(Integer.parseInt(itemId)
			, Double.parseDouble(bidPrice)
			, userId);
		response.setContentType("text/html; charset=GBK");
		// ���۳ɹ�
		if (bidId > 0)
		{
			response.getWriter().println("��ϲ�������۳ɹ�!");
		}
		else
		{
			response.getWriter().println("�Բ��𣬾���ʧ��!");
		}
	}
}