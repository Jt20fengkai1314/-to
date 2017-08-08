<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="zh-cn">
  <head>
    <base href="<%=basePath%>">
    <title>My JSP 'appInfo.jsp' starting page</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/statics/js/bootstrap.min.js"></script>
    <link href="${pageContext.request.contextPath}/statics/css/bootstrap.min.css" rel="stylesheet">
  </head>
  
  <body>
   <div style="margin:10px;" >
    	<div style="padding-left:10px;margin-bottom:10px;">
    		<form action="${pageContext.request.contextPath}/devUser/addAppInfo" target="mainFrame">
    			<input class="btn btn-primary" style="width:200px;height:30px;line-height:16px;" type="submit" value="新增APP基础信息">
    		</form>
    	</div>
    	<div style="margin:10px;margin-top:20px;">
			<div class="col-md-6 col-sm-6 col-xs-12" style="margin-right:100px;width:1150px;">
                <div class="x_panel">
                  <div class="x_content">
                    <table class="table table-striped">
                      <thead>
                        <tr>
                         <td style="padding-left:10px;">软件名称</td>
						<td >APK名称</td>
						<td>软件大小(MB)</td>
						<td>所属平台</td>
						<td style="padding-right:10px;">所属分类(一级分类--二级分类
						--三级分类)</td>
						<td>状态</td>
						<td>下载次数</td>
						<td>最新版本号</td>
						<td>操作</td>
                        </tr>
                      </thead>
                      <tbody>
                        <c:forEach items="${apps }" var="app">
						<tr style="border:1px solid #aaa;height:50px;margin-right:10px;">
						<td style="padding-left:10px;">${app.softwarename }</td>
						<td style="padding-right:10px;">${app.apkname }</td>
						<td >${app.softwaresize }</td>
						<td >${app.flatForm }</td>
						<td style="padding-right:10px;">${app.firstName }--${app.secondName }--${app.thirdName }</td>
						<td style="padding-right:10px;">${app.sta }</td>
						<td >${app.downloads }</td>
						<td >${app.versionNo }</td>
						<td style="width:120px;">
							<!-- Split button -->
							<div class="btn-group">
							  <button type="button" class="btn btn-danger">操  作</button>
							  <button type="button" class="btn btn-danger dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" >
							    <span class="caret"></span>
							    <span class="sr-only">Toggle Dropdown</span>
							  </button>
							  <ul class="dropdown-menu">
							    <li><a href="#">Action</a></li>
							    <li><a href="#">Another action</a></li>
							    <li><a href="#">Something else here</a></li>
							    <li role="separator" class="divider"></li>
							    <li><a href="#">Separated link</a></li>
							  </ul>
							</div>
						</td>
						</tr>
					</c:forEach>
                      </tbody>
                    </table>
                  </div>
                </div>
              </div>
    	</div>
    	<div style="margin-top:10px;margin-left:50px;">
	    		共${p.totalSize }条记录 &nbsp;&nbsp;<b id="now">${p.n }</b>/<span id="max">${p.totalPage==0?1:p.totalPage }</span>页
	    	</div>
	    	<div class="btn-group" role="group" aria-label="...">
				  <button type="button" style="margin-left:810px;" class="btn btn-info" onclick="showPage1();">首页</button>
				  <button type="button" class="btn btn-info" onclick="showPage2();">上一页</button>
				  <button type="button" class="btn btn-info" onclick="showPage3();">下一页</button>
				  <button type="button" class="btn btn-info" onclick="showPage4();">尾页</button>
			</div>
			<input type="hidden" id="softwareName" value="${msg.softwareName }">
			<input type="hidden" id="msgStatus" value="${msg.status }">
			<input type="hidden" id="flatform1" value="${msg.flatformId }">
			<input type="hidden" id="categoryLevel1" value="${msg.categoryLevel1 }">
			<input type="hidden" id="categoryLevel2" value="${msg.categoryLevel2 }">
			<input type="hidden" id="categoryLevel3" value="${msg.categoryLevel3 }">
			<script type="text/javascript">
				var softwareName=$("#softwareName").val();
				var status=$("#msgStatus").val();
				var flatformId=$("#flatform1").val();
				var categoryLevel1=$("#categoryLevel1").val();
				var categoryLevel2=$("#categoryLevel2").val();
				var categoryLevel3=$("#categoryLevel3").val();
				var n=parseInt($("#now").html());
				if(n==0){
					n=1;
				}
				var max=parseInt($("#max").html());
				if(max==0){
					max=1;
				}
				function showPage1(){
					n=1;
					go();
				}
				function showPage2(){
					n=n-1;
					if(n<=0){
						n=1;
					}
					go();
				}
				function showPage3(){
					n=n+1;
					if(n>=max){
						n=max;
					}
					go();
				}
				function showPage4(){
					n=max;
					go();
				}
				function go(){
					var url="2?n="+n+"&softwareName="+softwareName+"&status="+status+"&flatformId="
							+flatformId+"&categoryLevel1="+categoryLevel1+"&categoryLevel2="+categoryLevel2+"&categoryLevel3="+categoryLevel3;
					url=encodeURI(encodeURI(url));
					window.location.href=url;
				}
			</script>
    </div>
  </body>
</html>
