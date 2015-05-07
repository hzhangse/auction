package com.train.auction.action.interceptor;

import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import com.opensymphony.xwork2.*;
import java.util.Map;


public class AuthorityInterceptor extends AbstractInterceptor
{
	//�����û�����
	public String intercept(ActionInvocation invocation) throws Exception
	{
		//ȡ�ø����û���HTTP Session
		Map session = ActionContext.getContext().getSession();
		Object userId = session.get("userId");
		//����û�Session��userId����Ϊnull�����û���δ��¼
		if (userId == null)
		{
			return "login";
		}
		//���򣬼���ִ��Ŀ��Action��execute����
		else
		{
			return invocation.invoke();
		}
	}
}