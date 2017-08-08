<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
    <link href="vendors/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Font Awesome -->
    <link href="vendors/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <!-- NProgress -->
    <link href="vendors/nprogress/nprogress.css" rel="stylesheet">

    <!-- Custom Theme Style -->
    <link href="build/css/custom.min.css" rel="stylesheet">
  </head>

  <body class="nav-md">
    <div class="container body">
      <div class="main_container">
        <div class="col-md-3 left_col menu_fixed">
          <div class="left_col scroll-view">
            <div class="navbar nav_title" style="border: 0;">
              <a href="index.html" class="site_title"><i class="fa fa-paw"></i> <span>Gentelella Alela!</span></a>
            </div>

            <div class="clearfix"></div>

            <!-- menu profile quick info -->
            <div class="profile clearfix">
              <div class="profile_pic">
                <img src="images/img.jpg" alt="..." class="img-circle profile_img">
              </div>
              <div class="profile_info">
                <span>欢迎您,</span>
                <h2>${user.devname}</h2>
              </div>
            </div>
  
            <!-- /menu profile quick info -->

            <br />


            <!-- sidebar menu -->
            <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
              <div class="menu_section">
                <ul class="nav side-menu">
                  <li><a><i class="fa fa-home"></i> APP账户管理<span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="index.html">Dashboard</a></li>
                    </ul>
                  </li>
                  <li><a><i class="fa fa-edit"></i> APP应用管理 <span class="fa fa-chevron-down"></span></a>
                    <ul class="nav child_menu">
                      <li><a href="form.html">APP维护</a></li>
                    </ul>
                  </li>
                </ul>
              </div>
            </div>
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
                    <img src="images/img.jpg" alt="">${user.devname}
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
            <div class="clearfix"></div>
            <div class="row">
              <div class="col-md-12 col-sm-12 col-xs-12">
                <div class="x_panel">
                  <div class="x_title">
                    <h2>APP信息管理维护 <small><span class="glyphicon glyphicon-user" aria-hidden="true"></span>
              <a href="#">${测试账户}</a>
              您可以通过搜索或其他选项对APP信息进行修改、删除、管理等操作</h2>
                    <ul class="nav navbar-right panel_toolbox">
                      <li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a>
                      </li>
                      <li class="dropdown">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false"><i class="fa fa-wrench"></i></a>
                        <ul class="dropdown-menu" role="menu">
                          <li><a href="#">Settings 1</a>
                          </li>
                          <li><a href="#">Settings 2</a>
                          </li>
                        </ul>
                      </li>
                      <li><a class="close-link"><i class="fa fa-close"></i></a>
                      </li>
                    </ul>
                    <div class="clearfix"></div>
                  </div>
                  <div class="x_content">
                    <br />
                    <form id="demo-form2" class="form-inline">
                      <table class="table">
                        
                        <tbody>
                          <tr>
                            <td>
                              <div class="form-group">
                                <label for="exampleInputName2">软件名称</label>
                                <input type="text" class="form-control" id="exampleInputName2" placeholder="软件名称">
                              </div>
                            </td>
                            <td>
                              <div class="form-group">
                                <label for="exampleInputEmail2">APP状态</label>
                                <select name="" id="">
                                  <option>--请选择--</option>
                                  <option value="">Musrrrrrrrrrrrrtard</option>
                                  <option value="">Ketchup</option>
                                  <option value="">Relish</option>
                                </select>
                              </div>
                            </td>
                            <td>
                              <div class="form-group">
                                <label for="exampleInputEmail2">所属平台</label>
                                <select>
                                  <option>--请选择--</option>
                                  <option value="">Mustard</option>
                                  <option value="">Ketchup</option>
                                  <option value="">Relish</option>
                                </select>
                              </div>
                            </td>
                          </tr>
                          <tr>
                            <td>
                              <div class="form-group">
                                <label for="exampleInputEmail2">一级分类</label>
                                <select>
                                  <option>--请选择--</option>
                                  <option value="">Mustard</option>
                                  <option value="">Ketchup</option>
                                  <option value="">Relish</option>
                                </select>
                              </div>
                            </td>
                            <td>
                              <div class="form-group">
                                <label for="exampleInputEmail2">二级分类</label>
                                <select>
                                  <option>--请选择--</option>
                                  <option value="">Mustard</option>
                                  <option value="">Ketchup</option>
                                  <option value="">Relish</option>
                                </select>
                              </div>
                            </td>
                            <td>
                              <div class="form-group">
                                <label for="exampleInputEmail2">三级分类</label>
                                <select>
                                  <option>--请选择--</option>
                                  <option value="">Mustard</option>
                                  <option value="">Ketchup</option>
                                  <option value="">Relish</option>
                                </select>
                              </div>
                            </td>
                          </tr>
                          <tr>
                            <th scope="row">
                              <input class="btn btn-primary" type="button" value="查询">
                            </th>
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
                    <button type="button" class="btn btn-primary">新增APP基础信息</button>
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
                        <tr>
                          <th scope="row">1</th>
                          <td>Mark</td>
                          <td>Otto</td>
                          <td>@mdo</td>
                          <td>@mdo</td>
                          <td>@mdo</td>
                          <td>@mdo</td>
                          <td>@mdo</td>
                          <td>@mdo</td>
                        </tr>
                        <tr>
                          <th scope="row">2</th>
                          <td>Jacob</td>
                          <td>Thornton</td>
                          <td>Thornton</td>
                          <td>Thornton</td>
                          <td>Thornton</td>
                          <td>Thornton</td>
                          <td>Thornton</td>
                          <td>Thornton</td>
                        </tr>
                      </tbody>
                    </table>
                    <div class="ln_solid"></div>
                    <ul class="pager">
                        <li><a href="#">上一页</a></li>
                        <li><a href="#">下一页</a></li>
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
            ©2016版权所有。奉慨 ，天下第一！</a>
          </div>
          <div class="clearfix"></div>
        </footer>
        <!-- /footer content -->
      </div>
    </div>

    <!-- jQuery -->
    <script src="vendors/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap -->
    <script src="vendors/bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- FastClick -->
    <script src="vendors/fastclick/lib/fastclick.js"></script>
    <!-- NProgress -->
    <script src="vendors/nprogress/nprogress.js"></script>
    
    <!-- Custom Theme Scripts -->
    <script src="build/js/custom.min.js"></script>


  </body>
</html>