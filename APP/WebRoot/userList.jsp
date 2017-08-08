<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Meta, title, CSS, favicons, etc. -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>APP开发者平台</title>

<!-- Bootstrap -->
<link
	href="${pageContext.request.contextPath }/vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link
	href="${pageContext.request.contextPath }/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link
	href="${pageContext.request.contextPath }/vendors/nprogress/nprogress.css"
	rel="stylesheet">

<!-- Custom Theme Style -->
<link
	href="${pageContext.request.contextPath }/build/css/custom.min.css"
	rel="stylesheet">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/build/js/jquery-1.8.3.min.js"></script>
</head>

<body class="nav-md">
<script type="text/javascript" src="${pageContext.request.contextPath}/build/goUserList.js"></script>
	<div class="container body">
		<div class="main_container">
			<div class="col-md-3 left_col menu_fixed">
				<div class="left_col scroll-view">
					<div class="navbar nav_title" style="border: 0;">
						<a href="index.html" class="site_title"><i class="fa fa-paw"></i>
							<span>Gentelella Alela!</span></a>
					</div>

					<div class="clearfix"></div>

					<!-- menu profile quick info -->
					<div class="profile clearfix">
						<div class="profile_pic">
							<img src="${pageContext.request.contextPath }/images/img.jpg"
								alt="..." class="img-circle profile_img">
						</div>
						<div class="profile_info">
							<span>欢迎您,</span>
							<h2>${user.devname}</h2>
						</div>
					</div>

					<!-- /menu profile quick info -->

					<br />
					<!-- sidebar menu -->
					<div id="sidebar-menu"
						class="main_menu_side hidden-print main_menu">
						<div class="menu_section"></div>
					</div>
					<!-- /sidebar menu -->

					<!-- /menu footer buttons -->
					<div class="sidebar-footer hidden-small">
						<a data-toggle="tooltip" data-placement="top" title="Settings">
							<span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
						</a> <a data-toggle="tooltip" data-placement="top" title="FullScreen">
							<span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
						</a> <a data-toggle="tooltip" data-placement="top" title="Lock"> <span
							class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
						</a> <a data-toggle="tooltip" data-placement="top" title="Logout"
							href="login.html"> <span class="glyphicon glyphicon-off"
							aria-hidden="true"></span>
						</a>
					</div>
					<!-- /menu footer buttons -->
				</div>
			</div>

			<!-- top navigation -->
			<div class="top_nav">
				<div class="nav_menu">
					<nav>
						<div class="nav toggle">
							<a id="menu_toggle"><i class="fa fa-bars"></i></a>
						</div>
						<ul class="nav navbar-nav navbar-right">
							<li class=""><a href="javascript:;"
								class="user-profile dropdown-toggle" data-toggle="dropdown"
								aria-expanded="false"> <img
									src="${pageContext.request.contextPath }/images/img.jpg" alt="">${user.devname}
									<span class=" fa fa-angle-down"></span>
							</a>
								<ul class="dropdown-menu dropdown-usermenu pull-right">
									<li><a
										href="${pageContext.request.contextPath }/user/loginOut"><i
											class="fa fa-sign-out pull-right"></i>注销</a></li>
								</ul></li>
						</ul>
					</nav>
				</div>
			</div>
			<!-- /top navigation -->
			<!-- page content -->
			<div class="right_col" role="main">
				<div class="">
					<div class="clearfix"></div>
					<div class="row">
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<h2>
										APP信息管理维护 <small><span
											class="glyphicon glyphicon-user" aria-hidden="true"></span> <a
											href="#">${测试账户}</a> 您可以通过搜索或其他选项对APP信息进行修改、删除、管理等操作
									</h2>
									<ul class="nav navbar-right panel_toolbox">
										<li><a class="collapse-link"><i
												class="fa fa-chevron-up"></i></a></li>

										<li><a class="close-link"><i class="fa fa-close"></i></a>
										</li>
									</ul>
									<div class="clearfix"></div>
								</div>
								<div class="x_content">
									<br />
									<form id="demo-form2" class="form-inline" action="${pageContext.request.contextPath }/user/userList/1" method="post">
										<table class="table">
											<tbody>
												<tr>
													<td>
														<div class="form-group">
															<label for="exampleInputName2">软件名称</label> <input
																type="text" name="softwareName" class="form-control"
																id="exampleInputName2" placeholder="软件名称">
														</div>
													</td>
													<td>
														<div class="form-group">
															<label for="exampleInputEmail2">APP状态</label> <select
																name="status" id="status">
																<option value="0">--请选择--</option>
																<c:forEach items="${dt }" var="d">
																	<option value="${d.valueId}">${d.valueName }</option>
																</c:forEach>
															</select>
														</div>
													</td>
													<td>
														<div class="form-group">
															<label for="exampleInputEmail2">所属平台</label> <select
																id="flatformId" name="flatformId">
																<option value="0">--请选择--</option>
																<c:forEach items="${da}" var="d">
																	<option value="${d.valueId}">${d.valueName}</option>
																</c:forEach>

															</select>
														</div>
													</td>
												</tr>

												<tr>
													<td>
														<div class="form-group">
															<label for="exampleInputEmail2">一级分类</label> 
															<select id="A" name="categoryLevel1">
																<option value="0">--请选择--</option>
																<c:forEach items="${ac}" var="a">
																	<option value="${a.id }">${a.categoryname }</option>
																</c:forEach>
															</select>
														</div> 
														
													</td>
													<td>
														<div class="form-group">
															<label for="exampleInputEmail2">二级分类</label> 
															<select id="B" name="categoryLevel2">
																<option value="0">--请选择--</option>
															</select>
														</div>

													</td>
													<td>
														<div class="form-group">
															<label for="exampleInputEmail2">三级分类</label>
															 <select id="C" name="categoryLevel3">
																<option value="0">--请选择--</option>
															</select>
														</div>
													</td>
												</tr>
												<tr>
													<th scope="row"><input class="btn btn-primary"
														type="submit" value="查询"></th>
												</tr>
											</tbody>
										</table>

										<div class="ln_solid"></div>
									</form>
								</div>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">
								<div class="x_title">
									<button type="button" class="btn btn-primary"
										onclick="window.location.href='${pageContext.request.contextPath }/Version/VersionAppInfo'">新增APP基础信息</button>
								</div>
								<div class="x_content">
									<table class="table table-hover">
										<thead>
											<tr>
												<th>软件名称</th>
												<th>apk名称</th>
												<th>软件大小</th>
												<th>平台</th>
												<th>所属分类</th>
												<th>状态</th>
												<th>下载次数</th>
												<th>最新版本号</th>
												<th>操作</th>
											</tr>
										</thead>
										<tbody>
											<c:forEach items="${ap }" var="a">
												<tr>
													<th scope="row">${a.softwareName }</th>
													<td>${a.APKName }</td>
													<td>${a.softwareSize }</td>
													<td>${a.flatForm }</td>
													<td>${a.firstName }->${a.secondName}->${a.thirdName }</td>
													<td>${a.sta }</td>
													<td>${a.downloads}</td>
													<td>${a.versionNo }</td>
													<td>
														<div class="btn-group">
															<button type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
																点击操作 <span class="caret"></span>
															</button>
															<ul class="dropdown-menu">
															
																<li><a href="${pageContext.request.contextPath}/Version/VersionQuery/${a.id}">新增版本</a></li>
														 <c:if test="${a.versionNo!=null}"> 
																<li><a href="${pageContext.request.contextPath}/Version/VersionQueryUpdate/${a.gid}">修改版本</a></li>
														 </c:if>	 
																<li><a href="${pageContext.request.contextPath}/Version/VersionAppInfo/${a.id}">修改</a></li>
																<li><a href="${pageContext.request.contextPath}/appInfo/InfoDelete/${a.id}">删除</a></li>
														<c:if test="${a.status!=1 and a.status!=3 }">
																   <c:choose>
																	   <c:when test="${a.status==2 or a.status==5}">
																				<li><a href="${pageContext.request.contextPath}/appInfo/Putaway/${a.id}">上架</a></li>
																	    </c:when>
																		<c:otherwise>
																				<li><a href="${pageContext.request.contextPath}/appInfo/UnShelve/${a.id}">下架</a></li>
																		</c:otherwise>	
																	</c:choose>		
													   </c:if>	
															</ul>
														</div>
													</td>
												</tr>
											</c:forEach>

										</tbody>
									</table>
									<div class="ln_solid"></div>
									<ul class="pager">
										<li><input type="button" value="首页"
											onclick="window.location.href='${pageContext.request.contextPath}/user/userList/1?softwareName=${ai.softwareName}&status=${ai.status}&flatformId=${ai.flatformId}&categoryLevel1=${ai.categoryLevel1}&categoryLevel2=${ai.categoryLevel2}&categoryLevel3=${ai.categoryLevel3}'" /></li>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<li><input type="button" value="上一页"
											onclick="window.location.href='${pageContext.request.contextPath}/user/userList/${p-1>=1?p-1:p }?softwareName=${ai.softwareName}&status=${ai.status}&flatformId=${ai.flatformId}&categoryLevel1=${ai.categoryLevel1}&categoryLevel2=${ai.categoryLevel2}&categoryLevel3=${ai.categoryLevel3}'" /></li>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<li><input type="button" value="下一页"
											onclick="window.location.href='${pageContext.request.contextPath}/user/userList/${p+1<=totalPage?p+1:totalPage }?softwareName=${ai.softwareName}&status=${ai.status}&flatformId=${ai.flatformId}&categoryLevel1=${ai.categoryLevel1}&categoryLevel2=${ai.categoryLevel2}&categoryLevel3=${ai.categoryLevel3}'" /></li>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
										<li><input type="button" value="尾页"
											onclick="window.location.href='${pageContext.request.contextPath}/user/userList/${totalPage}?softwareName=${ai.softwareName}&status=${ai.status}&flatformId=${ai.flatformId}&categoryLevel1=${ai.categoryLevel1}&categoryLevel2=${ai.categoryLevel2}&categoryLevel3=${ai.categoryLevel3}'" /></li>
										&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

										<li>第${p}页&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;共${totalPage }页</li>
									</ul>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- /page content -->

			<!-- footer content -->
			<footer>
				<div class="pull-right">
					©2016版权所有 不要怀疑。奉慨 ， 狂拽酷炫吊炸天！</a>
				</div>
				<div class="clearfix"></div>
			</footer>
			<!-- /footer content -->
		</div>
	</div>

	<!-- jQuery -->
	<script
		src="${pageContext.request.contextPath }/vendors/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script
		src="${pageContext.request.contextPath }/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script
		src="${pageContext.request.contextPath }/vendors/fastclick/lib/fastclick.js"></script>
	<!-- NProgress -->
	<script
		src="${pageContext.request.contextPath }/vendors/nprogress/nprogress.js"></script>

	<!-- Custom Theme Scripts -->
	<script
		src="${pageContext.request.contextPath }/build/js/custom.min.js"></script>


</body>
</html>