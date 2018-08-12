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
<body >
	<table align="center" class="canvas" border="0" cellpadding="0"
		cellspacing="0" width="857">
		<tbody>
			<tr>
				<td>
					<div class="logo">
						<a href="#"> <img src="static/images/logo.png" width="368"
							height="161" border="0"/></a>
					</div> <img src="static/images/spacer.gif" width="100" height="1"
					border="0" alt="" />
				</td>
				<td><img src="static/images/spacer.gif" width="10" height="1"
					border="0" alt="" /></td>
				<td><img src="static/images/spacer.gif" width="275" height="1"
					border="0" alt="" /></td>
				<td><img src="static/images/spacer.gif" width="19" height="1"
					border="0" alt="" /></td>
				<td><img src="static/images/spacer.gif" width="368" height="1"
					border="0" alt="" /></td>
				<td><img src="static/images/spacer.gif" width="19" height="1"
					border="0" alt="" /></td>
				<td><img src="static/images/spacer.gif" width="11" height="1"
					border="0" alt="" /></td>
				<td><img src="static/images/spacer.gif" width="55" height="1"
					border="0" alt="" /></td>
				<td><img src="static/images/spacer.gif" width="1" height="1"
					border="0" alt="" /></td>
			</tr>
			<tr>
				<td colspan="8"><img src="static/images/spacer.gif" width="857"
					height="63" border="0" alt="" /></td>
				<td><img src="static/images/spacer.gif" width="1" height="63"
					border="0" alt="" /></td>
			</tr>
			<tr>
				<td rowspan="6"><img src="static/images/spacer.gif" width="100"
					height="443" border="0" alt="" /></td>
				<td rowspan="4" colspan="2"><img name="logoBack"
					src="static/images/logoBack.png" width="285" height="95" border="0"
					id="logoBack" alt="" /></td>
				<td colspan="4"><img name="actionNav"
					src="static/images/actionNav.png" width="417" height="17" border="0"
					id="actionNav" usemap="#actionNavMap" alt="" /></td>
				<td rowspan="6"><img src="static/images/spacer.gif" width="55"
					height="443" border="0" alt="" /></td>
				<td><img src="static/images/spacer.gif" width="1" height="17"
					border="0" alt="" /></td>
			</tr>
			<tr>
				<td rowspan="3"><img name="navLeft"
					src="static/images/navLeft.png" width="19" height="78" border="0"
					id="navLeft" alt="" /></td>
				<td><img name="navTop" src="static/images/mainNav-about.png"
					width="368" height="29" border="0" id="navTop" usemap="#mainNavMap"
					alt="" /></td>
				<td rowspan="3" colspan="2"><img name="navRight"
					src="static/images/navRight.png" width="30" height="78" border="0"
					id="navRight" alt="" /></td>
				<td><img src="static/images/spacer.gif" width="1" height="29"
					border="0" alt="" /></td>
			</tr>
			<tr>
				<td style="position: relative" id="snav">

					<div class="subNavback">
						<img src="static/images/subNav.png" alt=""
							style="position: absolute;" />
						<div class="subNav">
							<ul>
							<li class="vertRule"><a href="introduce"  target="mainFrame">首页</a></li>
								<li class="vertRule"><a href="doquestion/type" target="mainFrame">练习</a></li>
								<li class="vertRule"><a href="question/count" target="mainFrame"  >做题统计</a></li> 
								 <li class="vertRule"><a href="question/list" target="mainFrame" >历史记录</a></li> 
								<li class="vertRule"><a href="to_login" target="mainFrame" >登录</a></li>
								<li class="vertRule"><a href="logout" target="mainFrame" >退出</a></li>
								<li class="vertRule"><a href="to_reginster" target="mainFrame" >注册</a></li>
								<li><a href="about" target="mainFrame" >关于</a></li>
							</ul>
						</div>
					</div>
				</td>
				<td><img src="static/images/spacer.gif" width="1" height="19"
					border="0" alt="" /></td>
			</tr>
			<tr>
				<td><img name="navBottom" src="static/images/navBottom.png"
					width="368" height="30" border="0" id="navBottom" alt="" /></td>
				<td><img src="static/images/spacer.gif" width="1" height="30"
					border="0" alt="" /></td>
			</tr>
			<tr>
				<td style="vertical-align: top;"><img name="canvasLeft"
					src="static/images/canvasLeft.png" width="10" height="426"
					border="0" id="canvasLeft" alt="" /></td>
				<td class="content" colspan="4"
					style="vertical-align: top;" 
					 height="400" >
					  <iframe name="mainFrame" id="mainFrame"  height="100%"  width="100%"  
					  src="introduce.do"  frameborder="0">
					  </iframe>
				
				</td>
				<td
					style="vertical-align: top; ">
					<img name="canvasRight" src="static/images/canvasRight.png"
					width="11" height="426" border="0" id="canvasRight" alt="" />
				</td>
				<td><img src="static/images/spacer.gif" width="1"
					height="346" border="0" alt="" /></td>
			</tr>
			<tr>
				<td><img name="canvasLeftStretch"
					src="static/images/canvasLeftStretch.png" width="10" height="2"
					border="0" id="canvasLeftStretch" alt="" /></td>
				<td colspan="4"><img src="static/images/spacer.gif"
					width="681" height="2" border="0" alt="" /></td>
				<td><img name="canvasRightStretch"
					src="static/images/canvasRightStretch.png" width="11" height="2"
					border="0" id="canvasRightStretch" alt="" /></td>
				<td><img src="static/images/spacer.gif" width="1" height="2"
					border="0" alt="" /></td>
			</tr>
			<tr>
				<td colspan="8" valign="top"><img name="footer"
					src="static/images/footer.png" width="857" height="55" border="0"
					id="footer" alt="" /></td>
				<td><img src="static/images/spacer.gif" width="1" height="55"
					border="0" alt="" /></td>
			</tr>
		</tbody>
	</table>
</body>
</html>
