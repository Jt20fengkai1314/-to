<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
  <script type="text/javascript"
	src="${pageContext.request.contextPath}/build/js/jquery-1.8.3.min.js"></script>
  </head>

  <body class="nav-md">
 <script type="text/javascript" src="${pageContext.request.contextPath}/build/goUserList2.js"></script>
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
                    <img src="${pageContext.request.contextPath }/images/img.jpg" alt="">${user.devname}
                    <span class=" fa fa-angle-down"></span>
                  </a>
                  <ul class="dropdown-menu dropdown-usermenu pull-right">         
                       <li><a href="loginOut.jsp"><i class="fa fa-sign-out pull-right"></i>注销</a></li>
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
                <h3>表格验证</h3>
              </div>

            </div>
            <div class="clearfix"></div>

            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_content">

                    <form class="form-horizontal form-label-left" action="${pageContext.request.contextPath }/appInfo/InfoUpdata/${ai.id}" enctype="multipart/form-data" method="post">
							<span class="section">修改APP基础信息</span>

	                      <div class="item form-group">
	                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >软件名称 ：</label> 
	                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" value="${ai.softwareName}" required name="softwareName"   type="text"/>
	                      </div>
	                     <div class="item form-group">
	                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >APK名称 ：</label> 
	                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" value="${ai.APKName}" required disabled   name="APKName"   type="text"/>
	                      </div>
	                   <div class="item form-group">
	                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >支持ROM：</label> 
	                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" value="${ai.supportROM}" required  name="supportROM"   type="text"/>
	                      </div>
	                    <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12">界面语言 ：</label> 
                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" value="${ai.interfaceLanguage }"  required name="interfaceLanguage"   type="text"/>
                       </div>
                       <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12"> 下载次数 ：</label> 
                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" value="${ai.downloads}" required  name="downloads"   type="text"/>
                      </div>
                      <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12">所属平台 ：</label>
                       									 <select name="valueName"  class="control-label col-md-3 col-sm-3 col-xs-12" >
																<option value="0">--请选择--</option>
																<c:forEach items="${dd}" var="d"> 
																	<option value="${d.valueId }">${d.valueName}</option>
																</c:forEach>
															</select>
                      </div>
                      <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12">一级分类 ：</label> 
															<select id="A" name="categoryLevel1"  class="control-label col-md-3 col-sm-3 col-xs-12" >
																<option value="0">--请选择--</option>
																<c:forEach items="${ac}" var="c">
																	<option value="${c.id }">${c.categoryname}</option>
																</c:forEach>
															</select>
                      </div>
            
                      <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >二级分类 ：</label> 
                   
                   										  <select id="B" name="categoryLevel2"  class="control-label col-md-3 col-sm-3 col-xs-12" >
																<option value="0">--请选择--</option>
																
															</select>
                      </div>
                      <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >三级分类 ：</label> 
                      							<select id="C" name="categoryLevel3"  class="control-label col-md-3 col-sm-3 col-xs-12" >
																<option value="0">--请选择--</option>
												</select>
                      </div>
                      <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >APP状态 ：</label>																																											<!--禁用标签  -->			
                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" value="${ai.status==1?'待审核':ai.status==2?'审核通过':ai.status==3?'审核不通过':ai.status==4?'已上架':'已下架'}" disabled  name="status"   type="text"/>
                      </div>
                      <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12">应用简介 ：</label> 
                         <input  class="control-label col-md-3 col-sm-3 col-xs-12" value="${ai.appInfo }" required  name="appInfo"   type="text"/>
                      </div>
                     <div class="item form-group">
                         <label class="control-label col-md-3 col-sm-3 col-xs-12" >LOGO图片：</label> 
                         
                         <input id="input" style="display:none" class="control-label col-md-3 col-sm-3 col-xs-12" type="file"  name="pic"/> 
                      	
                      	<img src="${ai.logoPicPath}" width=80px height=80px id="IMG"/>&nbsp;&nbsp;&nbsp;&nbsp;<span id="SC">删除</span>
                      </div> 
                      <script type="text/javascript">
                      		$("#SC").click(function(){
                      			alert("完了");
                      			$("#IMG").hide();
                      			$(this).hide();
                      			$("#input").show();
                      		})
                      			
                      
                      </script>
                       
                       
                     
	                      <div class="ln_solid"></div>
	                      <div class="form-group">
	                        <div class="col-md-6 col-md-offset-3">
	                          <button type="button" class="btn btn-primary" onclick="window.location.href='${pageContext.request.contextPath }/user/userList/1'">返回</button>
	                          &nbsp;&nbsp;&nbsp;&nbsp;
	                          <button id="send" type="submit" class="btn btn-success">修改</button>
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