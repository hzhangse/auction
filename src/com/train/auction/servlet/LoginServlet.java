package com.train.auction.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;

import org.json.*;

import com.train.auction.service.AuctionManager;
import com.train.auction.servlet.base.BaseServlet;


@WebServlet(urlPatterns="/android/login.jsp")
public class LoginServlet extends BaseServlet
{
    public void service(HttpServletRequest request , 
		HttpServletResponse response)
		throws IOException , ServletException
	{
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		// ��ȡϵͳ��ҵ���߼����
		AuctionManager auctionManager = (AuctionManager)getCtx().getBean("mgr");
		// ��֤�û���¼
		int userId = auctionManager.validLogin(user , pass);
		response.setContentType("text/html; charset=GBK");
		// ��¼�ɹ�
		if (userId > 0)
		{
			request.getSession(true).setAttribute("userId" , userId);
		}
		try
		{
			// ����֤��userId��װ��JSONObject
			JSONObject jsonObj = new JSONObject()
				.put("userId" , userId);
			// �����Ӧ
			response.getWriter().println(jsonObj.toString()); 
		}
		catch (JSONException ex)
		{
			ex.printStackTrace();
		}
	}
}