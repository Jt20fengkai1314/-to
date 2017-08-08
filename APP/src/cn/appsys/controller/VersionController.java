/*   1:    */ package cn.appsys.controller;
/*   2:    */ 
/*   3:    */ import cn.appsys.dao.appVersionMapper;
/*   4:    */ import cn.appsys.dao.devUserMapper;
/*   5:    */ import cn.appsys.pojo.appCategory;
/*   6:    */ import cn.appsys.pojo.appInfo;
/*   7:    */ import cn.appsys.pojo.appVersion;
/*   8:    */ import cn.appsys.pojo.dataDictionary;
/*   9:    */ import cn.appsys.service.VersionService;
/*  10:    */ import java.io.PrintStream;
/*  11:    */ import java.util.Date;
/*  12:    */ import java.util.List;
/*  13:    */ import java.util.Map;
/*  14:    */ import javax.annotation.Resource;
/*  15:    */ import javax.servlet.http.HttpServletRequest;
/*  16:    */ import org.springframework.beans.factory.annotation.Autowired;
/*  17:    */ import org.springframework.stereotype.Controller;
/*  18:    */ import org.springframework.web.bind.annotation.PathVariable;
/*  19:    */ import org.springframework.web.bind.annotation.RequestMapping;
/*  20:    */ 
/*  21:    */ @Controller
/*  22:    */ @RequestMapping({"/Version"})
/*  23:    */ public class VersionController
/*  24:    */ {
/*  25:    */   @Autowired
/*  26:    */   private VersionService vService;
/*  27:    */   @Resource
/*  28:    */   private appVersionMapper aMapper;
/*  29:    */   @Resource
/*  30:    */   private devUserMapper dMapper;
/*  31:    */   
/*  32:    */   @RequestMapping({"/VersionUpdate/{id}"})
/*  33:    */   public String VersionUpdate(@PathVariable("id") Integer id, Map<String, Object> map, appVersion av)
/*  34:    */   {
/*  35: 38 */     int len = this.aMapper.VersionUpdate(av);
/*  36: 39 */     if (len <= 0) {
/*  37: 40 */       return "redirect:/Version/VersionQueryUpdate/" + id;
/*  38:    */     }
/*  39: 42 */     return "redirect:/user/userList/1";
/*  40:    */   }
/*  41:    */   
/*  42:    */   @RequestMapping({"/VersionQueryUpdate/{id}"})
/*  43:    */   public String VersionQueryUpdate(Map<String, Object> map, @PathVariable("id") Integer id)
/*  44:    */   {
/*  46: 48 */     List<appVersion> av = this.vService.VersionQueryAll();
/*  47: 49 */     map.put("av", av);
/*  48: 50 */     appVersion appV = this.aMapper.getIdQuery(id);
/*  49: 51 */     map.put("appV", appV);
/*  50: 52 */     return "VersionUpdate";
/*  51:    */   }
/*  52:    */   
/*  53:    */   @RequestMapping({"/VersionAppInfo/{id}"})
/*  54:    */   public String VersionModification(Map<String, Object> map, @PathVariable("id") Integer id)
/*  55:    */   {
/*  56: 59 */     appInfo ai = this.aMapper.IdQuery(id);
/*  57: 60 */     map.put("ai", ai);
/*  58: 61 */     List<dataDictionary> dd = this.dMapper.getAllBy("所属平台");
/*  59: 62 */     map.put("dd", dd);
/*  60: 63 */     List<appCategory> ac = this.dMapper.FirstClassifying();
/*  61: 64 */     map.put("ac", ac);
/*  62: 65 */     return "devUserUpdata";
/*  63:    */   }
/*  64:    */   
/*  65:    */   @RequestMapping({"/VersionAppInfo"})
/*  66:    */   public String VersionModification(Map<String, Object> map)
/*  67:    */   {
/*  68: 71 */     List<dataDictionary> ddt = this.dMapper.getAllBy("APP状态");
/*  69: 72 */     map.put("ddt", ddt);
/*  70: 73 */     List<dataDictionary> dd = this.dMapper.getAllBy("所属平台");
/*  71: 74 */     map.put("dd", dd);
/*  72: 75 */     List<appCategory> ac = this.dMapper.FirstClassifying();
/*  73: 76 */     map.put("ac", ac);
/*  74: 77 */     return "devUserAdd";
/*  75:    */   }
/*  76:    */   
/*  77:    */   @RequestMapping({"/VersionAdd/{appId}"})
/*  78:    */   public String VersionAdd(@PathVariable("appId")Integer appId,appVersion av)
/*  79:    */   { av.setAppId(appId);
/*  80: 85 */     av.setCreationDate(new Date());
/*  81: 86 */     av.setModifyDate(new Date());
/*  85: 90 */     int len = this.vService.VersionAdd(av);
/*  86: 91 */     if (len < 0) {
/*  87: 92 */       return "redirect:/Version/VersionQuery";
/*  88:    */     }
/*  89: 94 */     return "redirect:/user/userList/1";
/*  90:    */   }
/*  91:    */   
/*  92:    */   @RequestMapping({"/VersionQuery/{id}"})
/*  93:    */   public String VersionQueryAll(@PathVariable("id")Integer id,Map<String, Object> map)
/*  94:    */   {
/*  95:100 */     List<appVersion> av = this.vService.VersionQueryAll();
/*  96:101 */     map.put("av", av);
				  map.put("appId",id);
/*  97:102 */     return "VersionModification";
/*  98:    */   }
/*  99:    */ }