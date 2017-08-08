/*  1:   */ package cn.appsys.service;
/*  2:   */ 
/*  3:   */ import cn.appsys.dao.appVersionMapper;
/*  4:   */ import cn.appsys.pojo.appVersion;
/*  5:   */ import java.util.List;
/*  6:   */ import javax.annotation.Resource;
/*  7:   */ import org.springframework.stereotype.Service;
/*  8:   */ import org.springframework.transaction.annotation.Transactional;
/*  9:   */ 
/* 10:   */ @Service
/* 11:   */ @Transactional
/* 12:   */ public class VersionServiceImpl
/* 13:   */   implements VersionService
/* 14:   */ {
/* 15:   */   @Resource
/* 16:   */   private appVersionMapper aVMapper;
/* 17:   */   
/* 18:   */   public List<appVersion> VersionQueryAll()
/* 19:   */   {
/* 20:19 */     return this.aVMapper.VersionQueryAll();
/* 21:   */   }
/* 22:   */   
/* 23:   */   public int VersionAdd(appVersion av)
/* 24:   */   {
/* 25:24 */     return this.aVMapper.VersionAdd(av);
/* 26:   */   }
/* 27:   */ }


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.service.VersionServiceImpl
 * JD-Core Version:    0.7.0.1
 */