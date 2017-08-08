/*   1:    */ package cn.appsys.pojo;
/*   2:    */ 
/*   3:    */ import java.util.Date;
/*   4:    */ 
/*   5:    */ public class adPromotion
/*   6:    */ {
/*   7:    */   private Long id;
/*   8:    */   private Long appid;
/*   9:    */   private String adpicpath;
/*  10:    */   private Long adpv;
/*  11:    */   private Integer carouselposition;
/*  12:    */   private Date starttime;
/*  13:    */   private Date endtime;
/*  14:    */   private Long createdby;
/*  15:    */   private Date creationdate;
/*  16:    */   private Long modifyby;
/*  17:    */   private Date modifydate;
/*  18:    */   
/*  19:    */   public Long getId()
/*  20:    */   {
/*  21: 29 */     return this.id;
/*  22:    */   }
/*  23:    */   
/*  24:    */   public void setId(Long id)
/*  25:    */   {
/*  26: 33 */     this.id = id;
/*  27:    */   }
/*  28:    */   
/*  29:    */   public Long getAppid()
/*  30:    */   {
/*  31: 37 */     return this.appid;
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void setAppid(Long appid)
/*  35:    */   {
/*  36: 41 */     this.appid = appid;
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String getAdpicpath()
/*  40:    */   {
/*  41: 45 */     return this.adpicpath;
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void setAdpicpath(String adpicpath)
/*  45:    */   {
/*  46: 49 */     this.adpicpath = (adpicpath == null ? null : adpicpath.trim());
/*  47:    */   }
/*  48:    */   
/*  49:    */   public Long getAdpv()
/*  50:    */   {
/*  51: 53 */     return this.adpv;
/*  52:    */   }
/*  53:    */   
/*  54:    */   public void setAdpv(Long adpv)
/*  55:    */   {
/*  56: 57 */     this.adpv = adpv;
/*  57:    */   }
/*  58:    */   
/*  59:    */   public Integer getCarouselposition()
/*  60:    */   {
/*  61: 61 */     return this.carouselposition;
/*  62:    */   }
/*  63:    */   
/*  64:    */   public void setCarouselposition(Integer carouselposition)
/*  65:    */   {
/*  66: 65 */     this.carouselposition = carouselposition;
/*  67:    */   }
/*  68:    */   
/*  69:    */   public Date getStarttime()
/*  70:    */   {
/*  71: 69 */     return this.starttime;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void setStarttime(Date starttime)
/*  75:    */   {
/*  76: 73 */     this.starttime = starttime;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public Date getEndtime()
/*  80:    */   {
/*  81: 77 */     return this.endtime;
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void setEndtime(Date endtime)
/*  85:    */   {
/*  86: 81 */     this.endtime = endtime;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public Long getCreatedby()
/*  90:    */   {
/*  91: 85 */     return this.createdby;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void setCreatedby(Long createdby)
/*  95:    */   {
/*  96: 89 */     this.createdby = createdby;
/*  97:    */   }
/*  98:    */   
/*  99:    */   public Date getCreationdate()
/* 100:    */   {
/* 101: 93 */     return this.creationdate;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public void setCreationdate(Date creationdate)
/* 105:    */   {
/* 106: 97 */     this.creationdate = creationdate;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public Long getModifyby()
/* 110:    */   {
/* 111:101 */     return this.modifyby;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public void setModifyby(Long modifyby)
/* 115:    */   {
/* 116:105 */     this.modifyby = modifyby;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public Date getModifydate()
/* 120:    */   {
/* 121:109 */     return this.modifydate;
/* 122:    */   }
/* 123:    */   
/* 124:    */   public void setModifydate(Date modifydate)
/* 125:    */   {
/* 126:113 */     this.modifydate = modifydate;
/* 127:    */   }
/* 128:    */ }


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.pojo.adPromotion
 * JD-Core Version:    0.7.0.1
 */