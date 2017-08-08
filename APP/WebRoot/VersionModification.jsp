<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>APP开发者平台</title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath }/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath }/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath }/vendors/nprogress/nprogress.css" rel="stylesheet">
    
    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath }/build/css/custom.min.css" rel="stylesheet">
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>Gentelella Alela!</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="${pageContext.request.contextPath }/images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>欢迎您,</span>
                <h2>${user.devname}</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->
            <br />
            <!-- /menu footer buttons -->
            <div class="sidebar-footer hidden-small">
              <a data-toggle="tooltip" data-placement="top" title="Settings">
                <span class="glyphicon glyphicon-cog" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="FullScreen">
                <span class="glyphicon glyphicon-fullscreen" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Lock">
                <span class="glyphicon glyphicon-eye-close" aria-hidden="true"></span>
              </a>
              <a data-toggle="tooltip" data-placement="top" title="Logout" href="login.html">
                <span class="glyphicon glyphicon-off" aria-hidden="true"></span>
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
                <li class="">
                  <a href="javascript:;" class="user-profile dropdown-toggle" data-toggle="dropdown" aria-expanded="false">
                    <img src="${pageContext.request.contextPath }/images/img.jpg" alt="">${user.devname}
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">         
                       <li><a href="${pageContext.request.contextPath }/user/loginOut"><i class="fa fa-sign-out pull-right"></i>注销</a></li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->
			
						<div class="col-md-12 col-sm-12 col-xs-12">
							<div class="x_panel">			
								<div class="x_content">
									<table class="table table-hover">
										<thead>
											<tr>
												<th>软件名称</th>
												<th>版本号</th>
												<th>版本大小(单位.M)</th>
												<th>发布状态</th>
												<th>APK文件下载</th>
												<th>更新时间</th>
												
											</tr>
										</thead>
										<tbody>
							<c:forEach items="${av }" var="a"> 
												<tr>		
													<td>${a.isoftwareName}</td>
													<td>${a.versionNo}</td>
													<td>${a.versionSize}</td>
													<td>${a.publishStatus==1?"不发布":a.publishStatus==2?"已发布":"预发布"}</td>
													<td>${a.apkFileName}</td>
													<td><fmt:formatDate value="${a.modifyDate}" pattern="yyyy-MM-dd"/></td>
												</tr>
							 	</c:forEach>  

										</tbody>
									</table>
								</div>
							</div>
						</div>
			
        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>上面是历史版本</h3>
              </div>

            </div>
            <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_content">

                    <form class="form-horizontal form-label-left" action="${pageContext.request.contextPath }/Version/VersionAdd/${appId}" method="post">
							<span class="section">新增APP版本信息</span>

	                      <div class="item form-group">
	                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >版本号 ：</label> 
	                         <input  class="control-label col-md-3 col-sm-3 col-xs-12"  required name="versionNo"   type="text"/>
	                      </div>
	                     <div class="item form-group">
	                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >版本大小 ：</label> 
	                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" required   name="versionSize"   type="text"/>
	                      </div>
	                   <div class="item form-group">
	                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >发布状态：</label> 
	                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" disabled name="publishStatus" value="未发布"/>
	                      </div>
	                    <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12">版本简介 ：</label> 
                         <input  class="control-label col-md-3 col-sm-3 col-xs-12"  required name="versionInfo"   type="text"/>
                       </div>
                       <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12">apk文件 ：</label> 
                         <input  class="control-label col-md-3 col-sm-3 col-xs-12"   name="apkLocPath"   type="file"/>
                      </div>
                     

	                      <div class="ln_solid"></div>
	                      <div class="form-group">
	                        <div class="col-md-6 col-md-offset-3">
	                          <button type="button" class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath }/user/userList/1'">返回</button>
	                          &nbsp;&nbsp;&nbsp;&nbsp;
	                          <button id="send" type="submit" class="btn btn-success">添加</button>
	                        </div>
	                      </div>
                    </form>
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
        	<p>©2016版权所有。奉慨 ，天下第一！</p>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>

    <!-- jQuery -->
    <script src="${pageContext.request.contextPath }/vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="${pageContext.request.contextPath }/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="${pageContext.request.contextPath }/vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="${pageContext.request.contextPath }/vendors/nprogress/nprogress.js"></script>
    <!-- validator -->
    <script src="${pageContext.request.contextPath }/vendors/validator/validator.js"></script>

    <!-- Custom Theme Scripts -->
    <script src="${pageContext.request.contextPath }/build/js/custom.min.js"></script>
	
  </body>
</html>