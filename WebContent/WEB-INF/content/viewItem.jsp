

<%@ page contentType="text/html; charset=GBK" language="java" errorPage="" %>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
	"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>��������е���Ʒ</title>
</head>
<body>
<table width="780" align="center" cellspacing="0"
	background="images/bodybg.jpg">
<tr>
<td>
<br />
<s:actionerror/>
<table width="80%" align="center" cellpadding="0"
	cellspacing="1" style="border:1px solid black">
<tr bgcolor="#e1e1e1" >
	<td colspan="5"><div class="mytitle">��ǰ�����ǣ�<s:property value="kind"/></div></td> 
</tr>
  <tr height="30">
    <th>��Ʒ��</th>
    <th>����ʱ��</th>
    <th>��߼۸�</th>
    <th>������</th>
    <th>��Ʒ��ע</th>
  </tr>
<s:iterator id="item" value="items" status="st">
<tr height="24" <s:if test="#st.odd">
	style="background-color:#dddddd"</s:if>>
<td><a href='viewDetail.action?itemId=<s:property value="id"/>'>
<s:property value="name"/></a></td>
<td><s:property value="addTime"/></td>
<td><s:property value="maxPrice"/></td>
<td><s:property value="owner"/></td>
<td><s:property value="remark"/></td>
</tr>
</s:iterator>
</table>
</td>
</tr>
</table>
</body>
</html>