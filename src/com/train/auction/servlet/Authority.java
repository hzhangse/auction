package com.train.auction.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

import java.io.*;


@WebFilter(urlPatterns="/android/*")
public class Authority implements Filter
{
	public void init(FilterConfig config)
		throws ServletException
	{
	}

    public void doFilter(ServletRequest request, 
		ServletResponse response, FilterChain chain) 
		throws IOException , ServletException
	{
		HttpServletRequest hrequest = (HttpServletRequest)request;
		// ��ȡHttpSession����
		HttpSession session = hrequest.getSession(true);
		Integer userId = (Integer)session.getAttribute("userId");
		// ����û��Ѿ���¼�����û����ڵ�¼
		if ((userId != null && userId > 0)
			|| hrequest.getRequestURI().endsWith("/login.jsp"))
		{
			// �����С�����
			chain.doFilter(request , response);
		}
		else
		{
			response.setContentType("text/html; charset=GBK");
			// ���ɴ�����ʾ��
			response.getWriter().println("����û�е�¼ϵͳ������ϵͳ��"); 
		}
	}

    public void destroy()
    {
    }
}