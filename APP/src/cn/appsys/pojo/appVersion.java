/*   1:    */ package cn.appsys.pojo;
/*   2:    */ 
/*   3:    */ import java.io.Serializable;
/*   4:    */ import java.math.BigDecimal;
/*   5:    */ import java.util.Date;
/*   6:    */ 
/*   7:    */ public class appVersion
/*   8:    */   implements Serializable
/*   9:    */ {
/*  10:    */   private static final long serialVersionUID = -2592011403594552529L;
/*  11:    */   private Long id;
/*  12:    */   private Integer appId;
/*  13:    */   private String versionNo;
/*  14:    */   private String versionInfo;
/*  15:    */   private Long publishStatus;
/*  16:    */   private String downloadLink;
/*  17:    */   private BigDecimal versionSize;
/*  18:    */   private Long createdBy;
/*  19:    */   private Date creationDate;
/*  20:    */   private Long modifyBy;
/*  21:    */   private Date modifyDate;
/*  22:    */   private String apkLocPath;
/*  23:    */   private String apkFileName;
/*  24:    */   private String isoftwareName;
/*  25:    */   
/*  26:    */   public String getIsoftwareName()
/*  27:    */   {
/*  28: 42 */     return this.isoftwareName;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public void setIsoftwareName(String isoftwareName)
/*  32:    */   {
/*  33: 46 */     this.isoftwareName = isoftwareName;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public Long getId()
/*  37:    */   {
/*  38: 50 */     return this.id;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public void setId(Long id)
/*  42:    */   {
/*  43: 54 */     this.id = id;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public Integer getAppId()
/*  47:    */   {
/*  48: 58 */     return this.appId;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void setAppId(Integer appId)
/*  52:    */   {
/*  53: 62 */     this.appId = appId;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public String getVersionNo()
/*  57:    */   {
/*  58: 66 */     return this.versionNo;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public void setVersionNo(String versionNo)
/*  62:    */   {
/*  63: 70 */     this.versionNo = versionNo;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public String getVersionInfo()
/*  67:    */   {
/*  68: 74 */     return this.versionInfo;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public void setVersionInfo(String versionInfo)
/*  72:    */   {
/*  73: 78 */     this.versionInfo = versionInfo;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public Long getPublishStatus()
/*  77:    */   {
/*  78: 82 */     return this.publishStatus;
/*  79:    */   }
/*  80:    */   
/*  81:    */   public void setPublishStatus(Long publishStatus)
/*  82:    */   {
/*  83: 86 */     this.publishStatus = publishStatus;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public String getDownloadLink()
/*  87:    */   {
/*  88: 90 */     return this.downloadLink;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public void setDownloadLink(String downloadLink)
/*  92:    */   {
/*  93: 94 */     this.downloadLink = downloadLink;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public BigDecimal getVersionSize()
/*  97:    */   {
/*  98: 98 */     return this.versionSize;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void setVersionSize(BigDecimal versionSize)
/* 102:    */   {
/* 103:102 */     this.versionSize = versionSize;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public Long getCreatedBy()
/* 107:    */   {
/* 108:106 */     return this.createdBy;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public void setCreatedBy(Long createdBy)
/* 112:    */   {
/* 113:110 */     this.createdBy = createdBy;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public Date getCreationDate()
/* 117:    */   {
/* 118:114 */     return this.creationDate;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void setCreationDate(Date creationDate)
/* 122:    */   {
/* 123:118 */     this.creationDate = creationDate;
/* 124:    */   }
/* 125:    */   
/* 126:    */   public Long getModifyBy()
/* 127:    */   {
/* 128:122 */     return this.modifyBy;
/* 129:    */   }
/* 130:    */   
/* 131:    */   public void setModifyBy(Long modifyBy)
/* 132:    */   {
/* 133:126 */     this.modifyBy = modifyBy;
/* 134:    */   }
/* 135:    */   
/* 136:    */   public Date getModifyDate()
/* 137:    */   {
/* 138:130 */     return this.modifyDate;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void setModifyDate(Date modifyDate)
/* 142:    */   {
/* 143:134 */     this.modifyDate = modifyDate;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public String getApkLocPath()
/* 147:    */   {
/* 148:138 */     return this.apkLocPath;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public void setApkLocPath(String apkLocPath)
/* 152:    */   {
/* 153:142 */     this.apkLocPath = apkLocPath;
/* 154:    */   }
/* 155:    */   
/* 156:    */   public String getApkFileName()
/* 157:    */   {
/* 158:146 */     return this.apkFileName;
/* 159:    */   }
/* 160:    */   
/* 161:    */   public void setApkFileName(String apkFileName)
/* 162:    */   {
/* 163:150 */     this.apkFileName = apkFileName;
/* 164:    */   }
/* 165:    */   
/* 166:    */   public String toString()
/* 167:    */   {
/* 168:156 */     return 
/* 169:    */     
/* 170:    */ 
/* 171:    */ 
/* 172:    */ 
/* 173:    */ 
/* 174:    */ 
/* 175:163 */       "appVersion [id=" + this.id + ", appId=" + this.appId + ", versionNo=" + this.versionNo + ", versionInfo=" + this.versionInfo + ", publishStatus=" + this.publishStatus + ", downloadLink=" + this.downloadLink + ", versionSize=" + this.versionSize + ", createdBy=" + this.createdBy + ", creationDate=" + this.creationDate + ", modifyBy=" + this.modifyBy + ", modifyDate=" + this.modifyDate + ", apkLocPath=" + this.apkLocPath + ", apkFileName=" + this.apkFileName + ", isoftwareName=" + this.isoftwareName + "]";
/* 176:    */   }
/* 177:    */ }


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.pojo.appVersion
 * JD-Core Version:    0.7.0.1
 */