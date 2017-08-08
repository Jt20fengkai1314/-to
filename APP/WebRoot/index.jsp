<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>APP信息管理平台</title>
   <!-- Bootstrap -->
    <link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="vendors/nprogress/nprogress.css" rel="stylesheet">
    <!-- Animate.css -->
    <link href="vendors/animate.css/animate.min.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="build/css/custom.min.css" rel="stylesheet">
</head>

<body class="login">
	<div>
		<a class="hiddenanchor" id="signup"></a> <a class="hiddenanchor"
			id="signin"></a>

		<div class="login_wrapper">
			<div class="animate form login_form">
				<section class="login_content">
				<h1>APP信息管理平台</h1>
				<div>
					<input
						onclick="window.location.href='${pageContext.request.contextPath}/BackendUser/HTlogin'"
						class="form-control" type="button" value="后台管理系统入口"/>
				</div>
				<br/>
				<div>
					<input
						onclick="window.location.href='${pageContext.request.contextPath}/login.jsp'"
						class="form-control" type="button" value="开发者平台入口"/>
				</div>
				</section>
			</div>
		</div>
	</div>
</body>
<%-- <input type="button" value="tttttt"
	onclick="window.location.href='${pageContext.request.contextPath}/user/cs/1'"
	method="get" />
<h1>aaaaaaaaaaaa:${user.id}</h1>
 --%>
</html>
