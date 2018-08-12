<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>软件测试技术案例</title> 
<base href="<%=basePath%>"/>
<link rel="stylesheet" type="text/css" href="static/css/sm-default.css" />
<link rel="stylesheet" type="text/css" href="static/css/styles.css" />
<meta name="description" content="软件测试技术案例" />
<meta name="keywords" content="software testing, SpringMVC,Testing" />

</head>
<body>
	<table>
		<tr>
			<td>
				<p>
					<strong class="loginHeader">小学生学习练习系统</strong>
				</p>
				<p>软件测试技术课程案例。</p>

			</td>
			<td><img align="right" border="0"
				src="static/images/illo-showcase.png" /></td>
		</tr>
		<tr>
			<td colspan="2"><br /> <br />
				<p>练习内容包括：面积计算、周长计算、形状判定等。</p></td>
		</tr>

	</table>
</body>
</html>