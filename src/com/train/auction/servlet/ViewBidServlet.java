package com.train.auction.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;
import java.util.*;

import org.json.*;

import com.train.auction.business.*;
import com.train.auction.service.AuctionManager;
import com.train.auction.servlet.base.BaseServlet;


@WebServlet(urlPatterns="/android/viewBid.jsp")
public class ViewBidServlet extends BaseServlet
{
    public void service(HttpServletRequest request , 
		HttpServletResponse response)
		throws IOException , ServletException
	{
		// ��ȡuserId
		Integer userId = (Integer)request.getSession(true)
			.getAttribute("userId");
		// ��ȡҵ���߼����
		AuctionManager auctionManager = (AuctionManager)getCtx().getBean("mgr");
		// ��ȡ���û��������ȫ������
		List<BidBean> bids = auctionManager.getBidByUser(userId);
		JSONArray jsonArr= new JSONArray(bids);
		response.setContentType("text/html; charset=GBK");
		response.getWriter().println(jsonArr.toString()); 			
	}
}