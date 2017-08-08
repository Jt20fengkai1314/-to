package cn.appsys.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.alibaba.fastjson.JSON;
import cn.appsys.dao.devUserMapper;
import cn.appsys.pojo.appCategory;
import cn.appsys.pojo.appInfo;
import cn.appsys.pojo.appVersion;
import cn.appsys.pojo.backendUser;
import cn.appsys.pojo.dataDictionary;
import cn.appsys.service.BackendUserService;
import cn.appsys.tools.Page;
import cn.appsys.tools.ResultData;

@Controller
@RequestMapping(value="/BackendUser")
public class BackendUserController {
	@Autowired
	private BackendUserService bUserService;
	 
	//调用devUserMapper的方法
	@Resource
	private devUserMapper dUserMapper;
	
	
	//403
	@RequestMapping(value="/HT403")
	public String BackendUser(){
		System.out.println("Controller");
		return "redirect:../HT403.jsp";
	}
	
	//审核不通过
	@RequestMapping(value="/NoPass/{id}") public String NoPass(@PathVariable("id")Integer id){
		int len = bUserService.NoPass(id);
		if(len<=0){
			return "";
		}
		return "redirect:/BackendUser/BackendUserList/1";
	}
	//审核通过设置
	@RequestMapping(value="/Pass/{id}")
	public String Pass(@PathVariable("id")Integer id){
		int len = bUserService.Pass(id);
		if(len<=0){
			return "";
		}
		return "redirect:/BackendUser/BackendUserList/1";
	}
	//进入审核页面跳转
	@RequestMapping(value="/HTAudit/{id}")
	public String HTAudit(@PathVariable("id")Integer id,Model model){
		appInfo ai= bUserService.info(id);
		model.addAttribute("ai",ai);
		Long Versionid= ai.getVersionId();   //将appInfo表 对应的版本Id拿出来做条件
		appVersion  av= bUserService.Version(Versionid);
		model.addAttribute("av",av);
		return "WEB-INF/HTAudit";
	}
	//进入首页的跳转
	@RequestMapping(value="/BackendUserList/{p}")//带了一个页码p
	public String BackendUserList(@PathVariable("p")Integer p,Model model,appInfo ai,Map<String,Object> map){
		Page page=new Page();
		List<dataDictionary> da= dUserMapper.getAllBy("所属平台");
		model.addAttribute("da", da);
		List<appCategory> ac = dUserMapper.FirstClassifying();//一级分类,写死了
		model.addAttribute("ac", ac);
		ai.setStatus(1l);         //设置只查询--待审核---的信息
		int totalSize =bUserService.count(ai);//总记录数
		int totalPage=totalSize%page.getSize()==0?totalSize/page.getSize():totalSize/page.getSize()+1;//总页数	
		map.put("n", (p-1)*page.getSize());
		map.put("size", page.getSize());
		List<appInfo> ap = dUserMapper.QueryAll(map,ai);
		model.addAttribute("ap",ap);
		model.addAttribute("p", p);
		model.addAttribute("totalPage",totalPage);
		model.addAttribute("ai", ai);	//为分页而带的值
		return "WEB-INF/HTBackendList";
	}
	//进入首页跳转
	@RequestMapping(value="/HT-View")
	public String  HTView(){
		return "WEB-INF/HT-View";
	}	
	//进入后台管理系统	登录
	@RequestMapping(value="/HTlogin/{userCode}/{userPassword}")
	@ResponseBody
	public String HTlogin(HttpServletRequest request,@PathVariable("userCode")String userCode,@PathVariable("userPassword")String userPassword){
		ResultData rd = bUserService.HTlogin(userCode,userPassword);
		backendUser bUser=(backendUser)rd.getData();
		request.getSession().setAttribute("bUser",bUser);
		return JSON.toJSONString(rd);	
	}
	//登录跳转
	@RequestMapping(value="/HTlogin")
	public String DL(){
		return "WEB-INF/HTlogin";
	}
	//注销session
	@RequestMapping(value="/loginOut")
	public String HTloginOut(HttpServletRequest request){
	//	request.getSession().invalidate();
		request.getSession().removeAttribute("bUser");
		return "WEB-INF/HTlogin";
	}
	//永远先执行
	@ModelAttribute
	public void fengkai(HttpServletRequest request,HttpServletResponse response){
		try {
			request.setCharacterEncoding("UTF-8");
			response.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
