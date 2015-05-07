package com.train.auction.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;

import org.json.*;

import com.train.auction.service.AuctionManager;
import com.train.auction.servlet.base.BaseServlet;


@WebServlet(urlPatterns="/android/addKind.jsp")
public class AddKindServlet extends BaseServlet
{
    public void service(HttpServletRequest request , 
		HttpServletResponse response)
		throws IOException , ServletException
	{
		request.setCharacterEncoding("gbk");
		// ��ȡ�������
		String name = request.getParameter("kindName");
		String desc = request.getParameter("kindDesc");
		// ��ȡϵͳҵ���߼����
		AuctionManager auctionManager = (AuctionManager)getCtx().getBean("mgr");
		// ����ҵ���߼������ҵ�񷽷��������
		int kindId = auctionManager.addKind(name , desc);
		response.setContentType("text/html; charset=GBK");
		// ��ӳɹ�
		if (kindId > 0)
		{
			response.getWriter().println("��ϲ����������ӳɹ�!");
		}
		else
		{
			response.getWriter().println("�Բ����������ʧ��!");
		}
	}
}