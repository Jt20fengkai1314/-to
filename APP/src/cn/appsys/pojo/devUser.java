/*   1:    */ package cn.appsys.pojo;
/*   2:    */ 
/*   3:    */ import java.io.Serializable;
/*   4:    */ import java.util.Date;
/*   5:    */ 
/*   6:    */ public class devUser
/*   7:    */   implements Serializable
/*   8:    */ {
/*   9:    */   private static final long serialVersionUID = -9149192415326981023L;
/*  10:    */   private Long id;
/*  11:    */   private String devcode;
/*  12:    */   private String devname;
/*  13:    */   private String devpassword;
/*  14:    */   private String devemail;
/*  15:    */   private String devinfo;
/*  16:    */   private Long createdby;
/*  17:    */   private Date creationdate;
/*  18:    */   private Long modifyby;
/*  19:    */   private Date modifydate;
/*  20:    */   
/*  21:    */   public Long getId()
/*  22:    */   {
/*  23: 30 */     return this.id;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public void setId(Long id)
/*  27:    */   {
/*  28: 34 */     this.id = id;
/*  29:    */   }
/*  30:    */   
/*  31:    */   public String getDevcode()
/*  32:    */   {
/*  33: 38 */     return this.devcode;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public void setDevcode(String devcode)
/*  37:    */   {
/*  38: 42 */     this.devcode = (devcode == null ? null : devcode.trim());
/*  39:    */   }
/*  40:    */   
/*  41:    */   public String getDevname()
/*  42:    */   {
/*  43: 46 */     return this.devname;
/*  44:    */   }
/*  45:    */   
/*  46:    */   public void setDevname(String devname)
/*  47:    */   {
/*  48: 50 */     this.devname = (devname == null ? null : devname.trim());
/*  49:    */   }
/*  50:    */   
/*  51:    */   public String getDevpassword()
/*  52:    */   {
/*  53: 54 */     return this.devpassword;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public void setDevpassword(String devpassword)
/*  57:    */   {
/*  58: 58 */     this.devpassword = (devpassword == null ? null : devpassword.trim());
/*  59:    */   }
/*  60:    */   
/*  61:    */   public String getDevemail()
/*  62:    */   {
/*  63: 62 */     return this.devemail;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public void setDevemail(String devemail)
/*  67:    */   {
/*  68: 66 */     this.devemail = (devemail == null ? null : devemail.trim());
/*  69:    */   }
/*  70:    */   
/*  71:    */   public String getDevinfo()
/*  72:    */   {
/*  73: 70 */     return this.devinfo;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void setDevinfo(String devinfo)
/*  77:    */   {
/*  78: 74 */     this.devinfo = (devinfo == null ? null : devinfo.trim());
/*  79:    */   }
/*  80:    */   
/*  81:    */   public Long getCreatedby()
/*  82:    */   {
/*  83: 78 */     return this.createdby;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public void setCreatedby(Long createdby)
/*  87:    */   {
/*  88: 82 */     this.createdby = createdby;
/*  89:    */   }
/*  90:    */   
/*  91:    */   public Date getCreationdate()
/*  92:    */   {
/*  93: 86 */     return this.creationdate;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public void setCreationdate(Date creationdate)
/*  97:    */   {
/*  98: 90 */     this.creationdate = creationdate;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public Long getModifyby()
/* 102:    */   {
/* 103: 94 */     return this.modifyby;
/* 104:    */   }
/* 105:    */   
/* 106:    */   public void setModifyby(Long modifyby)
/* 107:    */   {
/* 108: 98 */     this.modifyby = modifyby;
/* 109:    */   }
/* 110:    */   
/* 111:    */   public Date getModifydate()
/* 112:    */   {
/* 113:102 */     return this.modifydate;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public void setModifydate(Date modifydate)
/* 117:    */   {
/* 118:106 */     this.modifydate = modifydate;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public String toString()
/* 122:    */   {
/* 123:111 */     return 
/* 124:    */     
/* 125:    */ 
/* 126:    */ 
/* 127:115 */       "devUser [id=" + this.id + ", devcode=" + this.devcode + ", devname=" + this.devname + ", devpassword=" + this.devpassword + ", devemail=" + this.devemail + ", devinfo=" + this.devinfo + ", createdby=" + this.createdby + ", creationdate=" + this.creationdate + ", modifyby=" + this.modifyby + ", modifydate=" + this.modifydate + "]";
/* 128:    */   }
/* 129:    */ }


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.pojo.devUser
 * JD-Core Version:    0.7.0.1
 */