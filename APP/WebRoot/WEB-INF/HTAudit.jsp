<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <!-- Meta, title, CSS, favicons, etc. -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>APP审核界面</title>

    <!-- Bootstrap -->
    <link href="${pageContext.request.contextPath }/vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="${pageContext.request.contextPath }/vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="${pageContext.request.contextPath }/vendors/nprogress/nprogress.css" rel="stylesheet">
    
    <!-- Custom Theme Style -->
    <link href="${pageContext.request.contextPath }/build/css/custom.min.css" rel="stylesheet">
  <script type="text/javascript"
	src="${pageContext.request.contextPath}/build/js/jquery-1.8.3.min.js"></script>
  </head>

  <body class="nav-md">
 <script type="text/javascript" src="${pageContext.request.contextPath}/build/goUserList.js"></script>
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
                <h2>${bUser.username}</h2>
              </div>
            </div>
            <!-- /menu profile quick info -->

            <br />

            <!-- sidebar menu -->
         <!--    <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
              </div>
            </div> -->
            <!-- /sidebar menu -->

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
                    <img src="${pageContext.request.contextPath }/images/img.jpg" alt="">${bUser.username}
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">         
                       <li><a href="${pageContext.request.contextPath}/BackendUser/loginOut"><i class="fa fa-sign-out pull-right"></i>注销</a></li>
                  </ul>
                </li>
              </ul>
            </nav>
          </div>
        </div>
        <!-- /top navigation -->

        <!-- page content -->
        <div class="right_col" role="main">
          <div class="">
            <div class="page-title">
              <div class="title_left">
                <h3>查看并审核APP信息 <img src="${pageContext.request.contextPath }/images/img.jpg" alt="">${bUser.username}</h3>
              </div>

            </div>
            <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_content">

                    <form class="form-horizontal form-label-left">
							<span class="section">APP基础信息</span>

	                      <div class="item form-group">
	                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >软件名称 ：</label> 
	                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" disabled value="${ai.softwareName}"  type="text"/>
	                      </div>
	                     <div class="item form-group">
	                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >APK名称 ：</label> 
	                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" disabled value="${ai.APKName}"  type="text"/>
	                      </div>
	                   <div class="item form-group">
	                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >支持ROM：</label> 
	                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" disabled value="${ai.supportROM}"   type="text"/>
	                      </div>
	                    <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12">界面语言 ：</label> 
                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" disabled value="${ai.interfaceLanguage }"  type="text"/>
                       </div>
                       <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12"> 下载次数 ：</label> 
                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" disabled value="${ai.downloads}"   type="text"/>
                      </div>
                      <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12">所属平台 ：</label>
                       	  <input  class="control-label col-md-3 col-sm-3 col-xs-12" disabled value="${d.valueName==1?'手机':d.valueName==2?'平板':'通用'}" type="text"/>	                      									
                      </div>
                     
            
                     
                      <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >APP状态 ：</label>																																											<!--禁用标签  -->			
                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" value="${ai.status==1?'待审核':ai.status==2?'审核通过':ai.status==3?'审核不通过':ai.status==4?'已上架':'已下架'}" disabled type="text"/>
                      </div>
                      <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12">应用简介 ：</label> 
                           <textarea class="control-label col-md-3 col-sm-3 col-xs-12" disabled>${ai.appInfo }</textarea>
		               </div>
		                    
                     <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >LOGO图片：</label> 
                         <img src="${ai.logoPicPath}" width=80px height=80px/>
                      </div> 

	                      <div class="ln_solid"></div>
	                      <div class="form-group">
	                        <div class="col-md-6 col-md-offset-3">
	                          <button type="button" class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath }/BackendUser/BackendUserList/1'">返回</button>
	                          &nbsp;&nbsp;&nbsp;&nbsp;
	                          <button id="send" type="button" onclick="window.location.href='${pageContext.request.contextPath }/BackendUser/Pass/${ai.id}'" class="btn btn-success">审核通过</button>
	                           &nbsp;&nbsp;&nbsp;&nbsp;
	                          <button id="send" type="button" onclick="window.location.href='${pageContext.request.contextPath }/BackendUser/NoPass/${ai.id}'" class="btn btn-success">审核不通过</button>
	                        </div>
	                      </div>
                    </form>
                  </div>
                </div>
                
                
                
<!-- 版本 -->
            <div class="page-title">
              <div class="title_left">
                <h3>最新版本信息</h3>
              </div>

            </div>
            <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_content">

                    <form class="form-horizontal form-label-left">
						

	                      <div class="item form-group">
	                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >版本号 ：</label> 
	                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" value="${av.versionNo }" disabled type="text"/>
	                      </div>
	                     <div class="item form-group">
	                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >版本大小 ：</label> 
	                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" value="${av.versionSize }" type="text"/>
	                      </div>
	                   <div class="item form-group">
	                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >发布状态：</label> 
	                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" value="${av.publishStatus==1?'不发布':appV.publishStatus==2?'已发布':'预发布'}" disabled type="text"/>
	                      </div>
	                    <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12">版本简介 ：</label> 
                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" value="${av.versionInfo}"  disabled type="text"/>
                       </div>
                       <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12">apk文件 ：</label> 
                         <input value="${av.apkFileName }"/><a href="#" >下载</a>
                      </div>
                  	                      
                    </form>
                  </div>
                </div>
              </div>
            </div>
      <!-- 版本 -->
                
                
                
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