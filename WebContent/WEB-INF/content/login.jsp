

<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>��ҵ����Java EE������</title>
</head>
<body>
<table width="780" align="center" cellspacing="0"
	background="images/bodybg.jpg">
<tr>
<td >
<h3>�������û����������¼ϵͳ</h3>
<div align="center">
<s:actionerror cssClass="error"/>
<s:form action="processLogin">
	<s:textfield name="username" label="�û���"/>
	<s:textfield name="password" label="����"/>
	<s:textfield name="vercode" label="��֤��"/>
	<s:submit value="��¼"/>
</s:form>
��֤�룺<img name="d" src="authImg.jpg">
</div>
</td>
</tr>
</table>
</body>
</html>