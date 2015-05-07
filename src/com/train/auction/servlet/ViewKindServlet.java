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


@WebServlet(urlPatterns="/android/viewKind.jsp")
public class ViewKindServlet extends BaseServlet
{
    public void service(HttpServletRequest request , 
		HttpServletResponse response)
		throws IOException , ServletException
	{
		// ��ȡҵ���߼����
		AuctionManager auctionManager = (AuctionManager)getCtx().getBean("mgr");
		// ��ȡϵͳ��������Ʒ����
		List<KindBean> kinds = auctionManager.getAllKind();
		// ��������Ʒ�����װ��JSONArray
		JSONArray jsonArr= new JSONArray(kinds);
		response.setContentType("text/html; charset=GBK");
		// ��JSONArrayת����JSON�ַ�����������ͻ���
		response.getWriter().println(jsonArr.toString());
	}
}