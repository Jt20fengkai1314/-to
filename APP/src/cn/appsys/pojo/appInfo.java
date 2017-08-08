/*   1:    */ package cn.appsys.pojo;
/*   2:    */ 
/*   3:    */ import java.io.Serializable;
/*   4:    */ import java.math.BigDecimal;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class appInfo
/*   8:    */   implements Serializable
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = 5660602140476753735L;
/*  11:    */   private Integer id;
/*  12:    */   private String softwareName;
/*  13:    */   private String APKName;
/*  14:    */   private String supportROM;
/*  15:    */   private String interfaceLanguage;
/*  16:    */   private BigDecimal softwareSize;
/*  17:    */   private Date updateDate;
/*  18:    */   private Long devId;
/*  19:    */   private String appInfo;
/*  20:    */   private Long status;
/*  21:    */   private Date onSaleDate;
/*  22:    */   private Date offSaleDate;
/*  23:    */   private Long flatformId;
/*  24:    */   private Long categoryLevel3;
/*  25:    */   private Long downloads;
/*  26:    */   private Long createdBy;
/*  27:    */   private Date creationDate;
/*  28:    */   private Long modifyBy;
/*  29:    */   private Date modifyDate;
/*  30:    */   private Long categoryLevel1;
/*  31:    */   private Long categoryLevel2;
/*  32:    */   private String logoPicPath;
/*  33:    */   private String logoLocPath;
/*  34:    */   private Long versionId;
/*  35:    */   private String sta;
/*  36:    */   private String firstName;
/*  37:    */   private String secondName;
/*  38:    */   private String thirdName;
/*  39:    */   private String versionNo;
/*  40:    */   private String flatForm;
/*  41:    */   private Integer gid;
/*  42:    */   
/*  43:    */   public String toString()
/*  44:    */   {
/*  45: 71 */     return 
/*  46:    */     
/*  47:    */ 
/*  48:    */ 
/*  49:    */ 
/*  50:    */ 
/*  51:    */ 
/*  52:    */ 
/*  53:    */ 
/*  54:    */ 
/*  55:    */ 
/*  56:    */ 
/*  57:    */ 
/*  58:    */ 
/*  59:    */ 
/*  60:    */ 
/*  61: 87 */       "appInfo [id=" + this.id + ", softwareName=" + this.softwareName + ", APKName=" + this.APKName + ", supportROM=" + this.supportROM + ", interfaceLanguage=" + this.interfaceLanguage + ", softwareSize=" + this.softwareSize + ", updateDate=" + this.updateDate + ", devId=" + this.devId + ", appInfo=" + this.appInfo + ", status=" + this.status + ", onSaleDate=" + this.onSaleDate + ", offSaleDate=" + this.offSaleDate + ", flatformId=" + this.flatformId + ", categoryLevel3=" + this.categoryLevel3 + ", downloads=" + this.downloads + ", createdBy=" + this.createdBy + ", creationDate=" + this.creationDate + ", modifyBy=" + this.modifyBy + ", modifyDate=" + this.modifyDate + ", categoryLevel1=" + this.categoryLevel1 + ", categoryLevel2=" + this.categoryLevel2 + ", logoPicPath=" + this.logoPicPath + ", logoLocPath=" + this.logoLocPath + ", versionId=" + this.versionId + ", sta=" + this.sta + ", firstName=" + this.firstName + ", secondName=" + this.secondName + ", thirdName=" + this.thirdName + ", versionNo=" + this.versionNo + ", flatForm=" + this.flatForm + ", gid=" + this.gid + "]";
/*  62:    */   }
/*  63:    */   
/*  64:    */   public Integer getGid()
/*  65:    */   {
/*  66: 91 */     return this.gid;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public void setGid(Integer gid)
/*  70:    */   {
/*  71: 95 */     this.gid = gid;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public String getFlatForm()
/*  75:    */   {
/*  76:100 */     return this.flatForm;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void setFlatForm(String flatForm)
/*  80:    */   {
/*  81:104 */     this.flatForm = flatForm;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public String getSta()
/*  85:    */   {
/*  86:108 */     return this.sta;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void setSta(String sta)
/*  90:    */   {
/*  91:112 */     this.sta = sta;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public String getFirstName()
/*  95:    */   {
/*  96:116 */     return this.firstName;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public void setFirstName(String firstName)
/* 100:    */   {
/* 101:120 */     this.firstName = firstName;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public String getSecondName()
/* 105:    */   {
/* 106:124 */     return this.secondName;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public void setSecondName(String secondName)
/* 110:    */   {
/* 111:128 */     this.secondName = secondName;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public String getThirdName()
/* 115:    */   {
/* 116:132 */     return this.thirdName;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public void setThirdName(String thirdName)
/* 120:    */   {
/* 121:136 */     this.thirdName = thirdName;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public String getVersionNo()
/* 125:    */   {
/* 126:140 */     return this.versionNo;
/* 127:    */   }
/* 128:    */   
/* 129:    */   public void setVersionNo(String versionNo)
/* 130:    */   {
/* 131:144 */     this.versionNo = versionNo;
/* 132:    */   }
/* 133:    */   
/* 134:    */   public Integer getId()
/* 135:    */   {
/* 136:149 */     return this.id;
/* 137:    */   }
/* 138:    */   
/* 139:    */   public void setId(Integer id2)
/* 140:    */   {
/* 141:153 */     this.id = id2;
/* 142:    */   }
/* 143:    */   
/* 144:    */   public String getSoftwareName()
/* 145:    */   {
/* 146:157 */     return this.softwareName;
/* 147:    */   }
/* 148:    */   
/* 149:    */   public void setSoftwareName(String softwareName)
/* 150:    */   {
/* 151:161 */     this.softwareName = softwareName;
/* 152:    */   }
/* 153:    */   
/* 154:    */   public String getAPKName()
/* 155:    */   {
/* 156:165 */     return this.APKName;
/* 157:    */   }
/* 158:    */   
/* 159:    */   public void setAPKName(String aPKName)
/* 160:    */   {
/* 161:169 */     this.APKName = aPKName;
/* 162:    */   }
/* 163:    */   
/* 164:    */   public String getSupportROM()
/* 165:    */   {
/* 166:173 */     return this.supportROM;
/* 167:    */   }
/* 168:    */   
/* 169:    */   public void setSupportROM(String supportROM)
/* 170:    */   {
/* 171:177 */     this.supportROM = supportROM;
/* 172:    */   }
/* 173:    */   
/* 174:    */   public String getInterfaceLanguage()
/* 175:    */   {
/* 176:181 */     return this.interfaceLanguage;
/* 177:    */   }
/* 178:    */   
/* 179:    */   public void setInterfaceLanguage(String interfaceLanguage)
/* 180:    */   {
/* 181:185 */     this.interfaceLanguage = interfaceLanguage;
/* 182:    */   }
/* 183:    */   
/* 184:    */   public BigDecimal getSoftwareSize()
/* 185:    */   {
/* 186:189 */     return this.softwareSize;
/* 187:    */   }
/* 188:    */   
/* 189:    */   public void setSoftwareSize(BigDecimal softwareSize)
/* 190:    */   {
/* 191:193 */     this.softwareSize = softwareSize;
/* 192:    */   }
/* 193:    */   
/* 194:    */   public Date getUpdateDate()
/* 195:    */   {
/* 196:197 */     return this.updateDate;
/* 197:    */   }
/* 198:    */   
/* 199:    */   public void setUpdateDate(Date updateDate)
/* 200:    */   {
/* 201:201 */     this.updateDate = updateDate;
/* 202:    */   }
/* 203:    */   
/* 204:    */   public Long getDevId()
/* 205:    */   {
/* 206:205 */     return this.devId;
/* 207:    */   }
/* 208:    */   
/* 209:    */   public void setDevId(Long devId)
/* 210:    */   {
/* 211:209 */     this.devId = devId;
/* 212:    */   }
/* 213:    */   
/* 214:    */   public String getAppInfo()
/* 215:    */   {
/* 216:213 */     return this.appInfo;
/* 217:    */   }
/* 218:    */   
/* 219:    */   public void setAppInfo(String appInfo)
/* 220:    */   {
/* 221:217 */     this.appInfo = appInfo;
/* 222:    */   }
/* 223:    */   
/* 224:    */   public Long getStatus()
/* 225:    */   {
/* 226:221 */     return this.status;
/* 227:    */   }
/* 228:    */   
/* 229:    */   public void setStatus(Long status)
/* 230:    */   {
/* 231:225 */     this.status = status;
/* 232:    */   }
/* 233:    */   
/* 234:    */   public Date getOnSaleDate()
/* 235:    */   {
/* 236:229 */     return this.onSaleDate;
/* 237:    */   }
/* 238:    */   
/* 239:    */   public void setOnSaleDate(Date onSaleDate)
/* 240:    */   {
/* 241:233 */     this.onSaleDate = onSaleDate;
/* 242:    */   }
/* 243:    */   
/* 244:    */   public Date getOffSaleDate()
/* 245:    */   {
/* 246:237 */     return this.offSaleDate;
/* 247:    */   }
/* 248:    */   
/* 249:    */   public void setOffSaleDate(Date offSaleDate)
/* 250:    */   {
/* 251:241 */     this.offSaleDate = offSaleDate;
/* 252:    */   }
/* 253:    */   
/* 254:    */   public Long getFlatformId()
/* 255:    */   {
/* 256:245 */     return this.flatformId;
/* 257:    */   }
/* 258:    */   
/* 259:    */   public void setFlatformId(Long flatformId)
/* 260:    */   {
/* 261:249 */     this.flatformId = flatformId;
/* 262:    */   }
/* 263:    */   
/* 264:    */   public Long getCategoryLevel3()
/* 265:    */   {
/* 266:253 */     return this.categoryLevel3;
/* 267:    */   }
/* 268:    */   
/* 269:    */   public void setCategoryLevel3(Long categoryLevel3)
/* 270:    */   {
/* 271:257 */     this.categoryLevel3 = categoryLevel3;
/* 272:    */   }
/* 273:    */   
/* 274:    */   public Long getDownloads()
/* 275:    */   {
/* 276:261 */     return this.downloads;
/* 277:    */   }
/* 278:    */   
/* 279:    */   public void setDownloads(Long downloads)
/* 280:    */   {
/* 281:265 */     this.downloads = downloads;
/* 282:    */   }
/* 283:    */   
/* 284:    */   public Long getCreatedBy()
/* 285:    */   {
/* 286:269 */     return this.createdBy;
/* 287:    */   }
/* 288:    */   
/* 289:    */   public void setCreatedBy(Long createdBy)
/* 290:    */   {
/* 291:273 */     this.createdBy = createdBy;
/* 292:    */   }
/* 293:    */   
/* 294:    */   public Date getCreationDate()
/* 295:    */   {
/* 296:277 */     return this.creationDate;
/* 297:    */   }
/* 298:    */   
/* 299:    */   public void setCreationDate(Date creationDate)
/* 300:    */   {
/* 301:281 */     this.creationDate = creationDate;
/* 302:    */   }
/* 303:    */   
/* 304:    */   public Long getModifyBy()
/* 305:    */   {
/* 306:285 */     return this.modifyBy;
/* 307:    */   }
/* 308:    */   
/* 309:    */   public void setModifyBy(Long modifyBy)
/* 310:    */   {
/* 311:289 */     this.modifyBy = modifyBy;
/* 312:    */   }
/* 313:    */   
/* 314:    */   public Date getModifyDate()
/* 315:    */   {
/* 316:293 */     return this.modifyDate;
/* 317:    */   }
/* 318:    */   
/* 319:    */   public void setModifyDate(Date modifyDate)
/* 320:    */   {
/* 321:297 */     this.modifyDate = modifyDate;
/* 322:    */   }
/* 323:    */   
/* 324:    */   public Long getCategoryLevel1()
/* 325:    */   {
/* 326:301 */     return this.categoryLevel1;
/* 327:    */   }
/* 328:    */   
/* 329:    */   public void setCategoryLevel1(Long categoryLevel1)
/* 330:    */   {
/* 331:305 */     this.categoryLevel1 = categoryLevel1;
/* 332:    */   }
/* 333:    */   
/* 334:    */   public Long getCategoryLevel2()
/* 335:    */   {
/* 336:309 */     return this.categoryLevel2;
/* 337:    */   }
/* 338:    */   
/* 339:    */   public void setCategoryLevel2(Long categoryLevel2)
/* 340:    */   {
/* 341:313 */     this.categoryLevel2 = categoryLevel2;
/* 342:    */   }
/* 343:    */   
/* 344:    */   public String getLogoPicPath()
/* 345:    */   {
/* 346:317 */     return this.logoPicPath;
/* 347:    */   }
/* 348:    */   
/* 349:    */   public void setLogoPicPath(String logoPicPath)
/* 350:    */   {
/* 351:321 */     this.logoPicPath = logoPicPath;
/* 352:    */   }
/* 353:    */   
/* 354:    */   public String getLogoLocPath()
/* 355:    */   {
/* 356:325 */     return this.logoLocPath;
/* 357:    */   }
/* 358:    */   
/* 359:    */   public void setLogoLocPath(String logoLocPath)
/* 360:    */   {
/* 361:329 */     this.logoLocPath = logoLocPath;
/* 362:    */   }
/* 363:    */   
/* 364:    */   public Long getVersionId()
/* 365:    */   {
/* 366:333 */     return this.versionId;
/* 367:    */   }
/* 368:    */   
/* 369:    */   public void setVersionId(Long versionId)
/* 370:    */   {
/* 371:337 */     this.versionId = versionId;
/* 372:    */   }
/* 373:    */ }


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.pojo.appInfo
 * JD-Core Version:    0.7.0.1
 */