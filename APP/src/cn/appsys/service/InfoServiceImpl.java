/*  1:   */ package cn.appsys.service;
/*  2:   */ 
/*  3:   */ import cn.appsys.dao.appInfoMapper;
/*  4:   */ import cn.appsys.pojo.appInfo;
/*  5:   */ import javax.annotation.Resource;
/*  6:   */ import org.springframework.stereotype.Service;
/*  7:   */ import org.springframework.transaction.annotation.Transactional;
/*  8:   */ 
/*  9:   */ @Service
/* 10:   */ @Transactional
/* 11:   */ public class InfoServiceImpl
/* 12:   */   implements InfoService
/* 13:   */ {
/* 14:   */   @Resource
/* 15:   */   private appInfoMapper aMapper;
/* 16:   */   
/* 17:   */   public int appInfoAdd(appInfo info)
/* 18:   */   {
/* 19:17 */     return this.aMapper.appInfoAdd(info);
/* 20:   */   }
/* 21:   */ }


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.service.InfoServiceImpl
 * JD-Core Version:    0.7.0.1
 */