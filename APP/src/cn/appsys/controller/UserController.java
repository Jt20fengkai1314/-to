/*   1:    */ package cn.appsys.controller;
/*   2:    */ 
/*   3:    */ import cn.appsys.pojo.appCategory;
/*   4:    */ import cn.appsys.pojo.appInfo;
/*   5:    */ import cn.appsys.pojo.dataDictionary;
/*   6:    */ import cn.appsys.pojo.devUser;
/*   7:    */ import cn.appsys.service.UserService;
/*   8:    */ import cn.appsys.tools.Page;
/*   9:    */ import cn.appsys.tools.ResultData;
/*  10:    */ import com.alibaba.fastjson.JSON;
/*  11:    */ import java.io.PrintStream;
/*  12:    */ import java.io.UnsupportedEncodingException;
/*  13:    */ import java.util.List;
/*  14:    */ import java.util.Map;
/*  15:    */ import javax.servlet.http.HttpServletRequest;
/*  16:    */ import javax.servlet.http.HttpServletResponse;
/*  17:    */ import javax.servlet.http.HttpSession;
/*  18:    */ import org.springframework.beans.factory.annotation.Autowired;
/*  19:    */ import org.springframework.stereotype.Controller;
/*  20:    */ import org.springframework.web.bind.annotation.ModelAttribute;
/*  21:    */ import org.springframework.web.bind.annotation.PathVariable;
/*  22:    */ import org.springframework.web.bind.annotation.RequestMapping;
/*  23:    */ import org.springframework.web.bind.annotation.ResponseBody;
/*  24:    */ 
/*  25:    */ @Controller
/*  26:    */ @RequestMapping({"/user"})
/*  27:    */ public class UserController
/*  28:    */ {
/*  29:    */   @Autowired
/*  30:    */   private UserService userService;
/*  31:    */   
/*  32:    */   @RequestMapping(value={"/Secondary2/{parentId}"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
/*  33:    */   @ResponseBody
/*  34:    */   public String ThirdClassification(@PathVariable("parentId") Integer parentId)
/*  35:    */   {
/*  36: 34 */     ResultData rd = new ResultData();
/*  37: 35 */     List<appCategory> ac = this.userService.ThirdClassification(parentId);
/*  38: 36 */     rd.setData(ac);
/*  39: 37 */     return JSON.toJSONString(rd);
/*  40:    */   }
/*  41:    */   
/*  42:    */   @RequestMapping(value={"/Secondary/{parentId}"}, method={org.springframework.web.bind.annotation.RequestMethod.POST})
/*  43:    */   @ResponseBody
/*  44:    */   public String SecondaryClassification(@PathVariable("parentId") Integer parentId)
/*  45:    */   {
				
/*  46: 44 */     ResultData rd = new ResultData();
/*  47: 45 */     List<appCategory> ac = this.userService.SecondaryClassification(parentId);
/*  48: 46 */     rd.setData(ac);
/*  49: 47 */     return JSON.toJSONString(rd);
/*  50:    */   }
/*  51:    */   
/*  52:    */   @RequestMapping({"/userList/{p}"})
/*  53:    */   public String QueryAll(Map<String, Object> map, @PathVariable("p") Integer p, appInfo ai, HttpServletRequest request)
/*  54:    */   { Page page = new Page();
/*  59: 58 */     List<dataDictionary> da = this.userService.getAllBy("所属平台");
/*  60: 59 */     map.put("da", da);
/*  61: 60 */     List<dataDictionary> dt = this.userService.getAllBy("APP状态");
/*  62: 61 */     map.put("dt", dt);
/*  64: 63 */     List<appCategory> ac = this.userService.FirstClassifying();
/*  65: 64 */     map.put("ac", ac);
/*  67: 66 */     int totalSize = this.userService.count(ai);
/*  69: 68 */     int totalPage = totalSize % page.getSize().intValue() == 0 ? totalSize / page.getSize().intValue() : totalSize / page.getSize().intValue() + 1;
/*  70: 69 */     map.put("n", Integer.valueOf((p.intValue() - 1) * page.getSize().intValue()));
/*  71: 70 */     map.put("size", page.getSize());
/*  72: 71 */     List<appInfo> ap = this.userService.QueryAll(map, ai);
/*  73: 72 */     map.put("p", p);
/*  74: 73 */     map.put("totalPage", Integer.valueOf(totalPage));
/*  75: 74 */     map.put("ap", ap);
/*  76: 75 */     map.put("ai", ai);
/*  78: 77 */     return "userList";
/*  79:    */   }
/*  81:    */   @RequestMapping({"/login/{devCode}/{devPassword}"})
/*  82:    */   @ResponseBody
/*  83:    */   public String deleteByPrimaryKey(@PathVariable("devCode") String devCode, @PathVariable("devPassword") String devPassword, HttpServletRequest request)
/*  84:    */   { ResultData rd = this.userService.deleteByPrimaryKey(devPassword, devPassword);
/*  86: 86 */     devUser user = (devUser)rd.getData();
/*  87: 87 */     request.getSession().setAttribute("user", user);
/*  88: 88 */     rd.setData(null);
/*  89: 89 */     return JSON.toJSONString(rd);
/*  90:    */   }
/*  92:    */   @RequestMapping({"/loginOut"})
/*  93:    */   public String logOut(HttpServletRequest request)
/*  94:    */   { request.getSession().invalidate();
/*  96: 95 */     request.getSession().removeAttribute("user");
/*  97: 96 */     return "login";
/*  98:    */   }
/*  99:    */    @ModelAttribute
/* 101:    */   public void fengkai(HttpServletRequest request, HttpServletResponse response){
/* 103:    */     try{
/* 105:105 */       request.setCharacterEncoding("utf-8");
/* 106:106 */       response.setCharacterEncoding("utf-8");
/* 107:    */     }
/* 108:    */     catch (UnsupportedEncodingException e){
/* 110:108 */       e.printStackTrace();
/* 111:    */     }
/* 112:    */   }
/* 113:    */ }