<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>100以内加减乘除运算</title>
</head>
<h2>请计算下面给出的100以内的加减乘除题目</h2>
<body>
	<td align='center'>${question.problem}</td>
	<view>请输入答案：</view>
	<td align="right"><input name="answer" type="string"/></td>
	<td>${question.result}</td>
</body>
</html>