<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'search.jsp' starting page</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="statics/js/bootstrap.min.js"></script>
    <link href="statics/css/bootstrap.min.css" rel="stylesheet">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div style="margin:10px;">
    	<div style="margin-top:10px;padding-bottom:1px;padding-left:10px;">
    	<b  style="font-size:24px;line-height:24px;">APP信息管理维护
    	<img style="height:24px;" src="production/images/user.png"></b>
    	${devUser.devname},您可以通过检索，查找相应app信息并进行修改！<hr/>
    	</div>
    	<form method="post" action="${pageContext.request.contextPath}/devUser/appInfo/2" target="appInfoFrame">
    	<div align="center">
    		<table class="list" width="1000px">
				<tbody>
					<tr >
						<td style="padding-bottom:15px;">
						<div style="line-height:30px;width:80px;float:left;">
								软件名称
							</div>
							<div style="width:200px;float:left;">
							<input style="width:185px;height:30px;" class="form-control" id="softwareName" value="${msg.softwareName }" name="softwareName">
							</div>
						</td>
						<td style="padding-bottom:15px;">
							<div style="line-height:30px;width:80px;float:left;">
								APP状态
							</div>
							<div style="width:200px;float:left;">
							<input type="hidden" id="msgStatus" value="${msg.status }">
	                          <select class="form-control" style="width:185px;height:30px;" name="status" id="status" >
	                            <OPTION selected value="0">请选择...</OPTION>
											<c:forEach items="${status }" var="s">
											<OPTION value="${s.valueid }">${s.valuename }</OPTION>
											</c:forEach>
	                          </select>
	                          </div>
						</td>
						<td style="padding-bottom:15px;">
							<div style="line-height:30px;width:80px;float:left;">
									所属平台
								</div>
								<div style="width:200px;float:left;">
								<input type="hidden" id="flatform1" value="${msg.flatformId }">
		                          <select class="form-control" style="width:185px;height:30px;"  name="flatformId" id="flatformId" >
		                            	<OPTION selected value="0">请选择...</OPTION>
										<c:forEach items="${flatForm }" var="f">
											<OPTION value="${f.valueid }">${f.valuename }</OPTION>
										</c:forEach>
		                          </select>
		                    </div>
						</td>
					</tr>
					<tr>
						<td>
						<div style="line-height:30px;width:80px;float:left;">
							一级分类
						</div>
						<div style="width:200px;float:left;">
						<input type="hidden" id="categoryLevel1" value="${msg.categoryLevel1 }">
                          <select class="form-control" style="width:185px;height:30px;"  name="categoryLevel1" id="first" onchange="firstChange();">
                            <OPTION selected value="0">请选择...</OPTION>
										<c:forEach items="${first }" var="ft">
										<OPTION value="${ft.id }">${ft.categoryname }</OPTION>
										</c:forEach>
                          </select>
                          </div>
						<script	type="text/javascript">
							function firstChange(){
								var first= $("#first").val();
								if(first==0){
									$("#second").html("<OPTION selected value='0' id='sd1'></OPTION>");
									$("#third").html("<OPTION selected value='0' id='td1'></OPTION>");
								}else{
									$("#second").html("<OPTION selected value='0' id='sd1'>请选择...</OPTION>");
									$.post("devUser/appCategory",{"parentId":first},function(data){
										if(data!=null){
											if(data.data!=null){
												var second=$("#second").html();
												for(var i=0;i<data.data.length;i++){
													second=second+"<OPTION value='"+data.data[i].id+"'>"+data.data[i].categoryname+"</OPTION>";
												}
												$("#second").html(second);
											}
										};
									},"json");
								}
							};
						</script>
						</td>
						<td >
							<div style="line-height:30px;width:80px;float:left;">
										二级分类
							</div>
							<div style="width:200px;float:left;">
							<input type="hidden" id="categoryLevel2" value="${msg.categoryLevel2 }">
			                          <select class="form-control" style="width:185px;height:30px;"  name="categoryLevel2" id="second" >
			                            	<OPTION selected value="0" id="sd1"></OPTION>
			                          </select>
			                </div>
						<script	type="text/javascript">
							$("#second").change(function(){
								var second= $(this).val();
								if(second==0){
									$("#third").html("<OPTION selected value='0' id='td1'></OPTION>");
								}else{
									$("#third").html("<OPTION selected value='0' id='td1'>请选择...</OPTION>");
									$.post("devUser/appCategory",{"parentId":second},function(data){
										if(data!=null){
											if(data.data!=null){
												var third=$("#third").html();
												for(var i=0;i<data.data.length;i++){
													third=third+"<OPTION value='"+data.data[i].id+"'>"+data.data[i].categoryname+"</OPTION>";
												}
												$("#third").html(third);
											}
										};
									},"json");
								}
							});
						</script>
						</td>
						<td >
							<div style="line-height:30px;width:80px;float:left;">
											三级分类
							</div>
							<div style="width:200px;float:left;">
							<input type="hidden" id="categoryLevel3" value="${msg.categoryLevel3 }">
		                          <select class="form-control" style="width:185px;height:30px;"  name="categoryLevel3" id="third" >
		                            	<OPTION selected value="0" id="td1"></OPTION>
		                          </select>
				            </div>
						</td>
					</tr>
				</tbody>
			</table>
    	</div>
    	<div style="margin-top:15px;padding-left:820px;">
    		<input class="btn btn-primary" style="width:100px;" type="reset" value="重 置">
    		&nbsp;&nbsp;&nbsp;&nbsp;
    		<input class="btn btn-primary" style="width:100px;" type="submit" value="查  询">
    	</div>
    	</form>
    </div >
  </body>
</html>
