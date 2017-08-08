<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">

<html lang="en">
<script type="text/javascript" src="${pageContext.request.contextPath}/build/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
		function to(){
				var userCode = $(":text").val();
				var userPassword = $(":password").val();
				if (userCode == "" || userPassword == "") {
					alert("用户名和密码不能为空");
					return false;
				}
				$("#userCode").html("");
				$("#userPassword").html("");
				
				$.post("../BackendUser/HTlogin/" + userCode + "/" + userPassword, {}, function(data) {	
					if (data != null) {
						if (data.flag == 1) {
							$("#QuserCode").html(data.msg);
						} else if (data.flag == 2) {
						alert(3333);
							$("#QuserPassword").html(data.msg);
						} else {
							window.location.href = "HT-View";
						}
					}
				}, "json");
		};

</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>登录页面</title>

<!-- Bootstrap -->
<link href="${pageContext.request.contextPath}/vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link href="${pageContext.request.contextPath}/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link href="${pageContext.request.contextPath}/vendors/nprogress/nprogress.css" rel="stylesheet">
<!-- Animate.css -->
<link href="${pageContext.request.contextPath}/vendors/animate.css/animate.min.css" rel="stylesheet">

<!-- Custom Theme Style -->
<link href="${pageContext.request.contextPath}/build/css/custom.min.css" rel="stylesheet">
<script type="text/javascript" src="${pageContext.request.contextPath}/build/js/jquery-1.8.3.min.js"></script>
</head>

<body class="login">
	<div>
		<a class="hiddenanchor" id="signup"></a><a class="hiddenanchor" id="signin"></a>
		<div class="login_wrapper">
			<div class="animate form login_form">
				<section class="login_content">
				<form>
				<h1>APP后台管理系统</h1>
				<div>
					<input type="text" class="form-control" placeholder="Username" />
					<span id="QuserCode"></span>
				</div>
				<br />
				<div>
					<input type="password" class="form-control" placeholder="Password" />
					<span id="QuserPassword"></span>
				</div>
				<br />
				<div>
						<input type="button" onclick="to();" required id="button" value="登录" class="btn btn-default submit"/>
						&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
						<input type="reset"  id="reset" required value="重置" class="btn btn-default submit"/>
				</div>
				<div class="separator">
					<p>©2016版权所有。奉慨*一统天下！</p>
				</div>
			</div>
			</form>
			</section>
		</div>
	</div>
</body>
</html>

