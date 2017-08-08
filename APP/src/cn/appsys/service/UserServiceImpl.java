/*  1:   */ package cn.appsys.service;
/*  2:   */ 
/*  3:   */ import cn.appsys.dao.devUserMapper;
/*  4:   */ import cn.appsys.pojo.appCategory;
/*  5:   */ import cn.appsys.pojo.appInfo;
/*  6:   */ import cn.appsys.pojo.dataDictionary;
/*  7:   */ import cn.appsys.pojo.devUser;
/*  8:   */ import cn.appsys.tools.ResultData;
/*  9:   */ import java.util.List;
/* 10:   */ import java.util.Map;
/* 11:   */ import javax.annotation.Resource;
/* 12:   */ import org.springframework.stereotype.Service;
/* 13:   */ import org.springframework.transaction.annotation.Transactional;
/* 14:   */ 
/* 15:   */ @Service
/* 16:   */ @Transactional
/* 17:   */ public class UserServiceImpl
/* 18:   */   implements UserService
/* 19:   */ {
/* 20:   */   @Resource
/* 21:   */   private devUserMapper dMapper;
/* 22:   */   
/* 23:   */   public int count(appInfo ai)
/* 24:   */   {
/* 25:26 */     return this.dMapper.count(ai);
/* 26:   */   }
/* 27:   */   
/* 28:   */   public ResultData deleteByPrimaryKey(String devCode, String devPassword)
/* 29:   */   {
/* 30:31 */     ResultData rd = new ResultData();
/* 31:32 */     devUser user = this.dMapper.deleteByPrimaryKey(devCode);
/* 32:33 */     if (user == null)
/* 33:   */     {
/* 34:34 */       rd.setFlag(1);
/* 35:35 */       rd.setMsg("用户名错误！");
/* 36:   */     }
/* 37:37 */     else if (!devPassword.equals(user.getDevpassword()))
/* 38:   */     {
/* 39:38 */       rd.setFlag(2);
/* 40:39 */       rd.setMsg("密码错误！");
/* 41:   */     }
/* 42:   */     else
/* 43:   */     {
/* 44:41 */       rd.setFlag(0);
/* 45:42 */       rd.setMsg("登录成功！");
/* 46:43 */       rd.setData(user);
/* 47:   */     }
/* 48:46 */     return rd;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public List<appInfo> QueryAll(Map<String, Object> map, appInfo ai)
/* 52:   */   {
/* 53:51 */     return this.dMapper.QueryAll(map, ai);
/* 54:   */   }
/* 55:   */   
/* 56:   */   public List<dataDictionary> getAllBy(String typeName)
/* 57:   */   {
/* 58:62 */     return this.dMapper.getAllBy(typeName);
/* 59:   */   }
/* 60:   */   
/* 61:   */   public List<appCategory> FirstClassifying()
/* 62:   */   {
/* 63:67 */     return this.dMapper.FirstClassifying();
/* 64:   */   }
/* 65:   */   
/* 66:   */   public List<appCategory> SecondaryClassification(Integer parentId)
/* 67:   */   {
/* 68:73 */     return this.dMapper.SecondaryClassification(parentId);
/* 69:   */   }
/* 70:   */   
/* 71:   */   public List<appCategory> ThirdClassification(Integer parentId)
/* 72:   */   {
/* 73:79 */     return this.dMapper.ThirdClassification(parentId);
/* 74:   */   }
/* 75:   */ }


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.service.UserServiceImpl
 * JD-Core Version:    0.7.0.1
 */