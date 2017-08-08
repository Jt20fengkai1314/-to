/*  1:   */ package cn.appsys.pojo;
/*  2:   */ 
/*  3:   */ import java.util.Date;
/*  4:   */ 
/*  5:   */ public class appCategory
/*  6:   */ {
/*  7:   */   private Long id;
/*  8:   */   private String categorycode;
/*  9:   */   private String categoryname;
/* 10:   */   private Long parentid;
/* 11:   */   private Long createdby;
/* 12:   */   private Date creationtime;
/* 13:   */   private Long modifyby;
/* 14:   */   private Date modifydate;
/* 15:   */   
/* 16:   */   public Long getId()
/* 17:   */   {
/* 18:23 */     return this.id;
/* 19:   */   }
/* 20:   */   
/* 21:   */   public void setId(Long id)
/* 22:   */   {
/* 23:27 */     this.id = id;
/* 24:   */   }
/* 25:   */   
/* 26:   */   public String getCategorycode()
/* 27:   */   {
/* 28:31 */     return this.categorycode;
/* 29:   */   }
/* 30:   */   
/* 31:   */   public void setCategorycode(String categorycode)
/* 32:   */   {
/* 33:35 */     this.categorycode = (categorycode == null ? null : categorycode.trim());
/* 34:   */   }
/* 35:   */   
/* 36:   */   public String getCategoryname()
/* 37:   */   {
/* 38:39 */     return this.categoryname;
/* 39:   */   }
/* 40:   */   
/* 41:   */   public void setCategoryname(String categoryname)
/* 42:   */   {
/* 43:43 */     this.categoryname = (categoryname == null ? null : categoryname.trim());
/* 44:   */   }
/* 45:   */   
/* 46:   */   public Long getParentid()
/* 47:   */   {
/* 48:47 */     return this.parentid;
/* 49:   */   }
/* 50:   */   
/* 51:   */   public void setParentid(Long parentid)
/* 52:   */   {
/* 53:51 */     this.parentid = parentid;
/* 54:   */   }
/* 55:   */   
/* 56:   */   public Long getCreatedby()
/* 57:   */   {
/* 58:55 */     return this.createdby;
/* 59:   */   }
/* 60:   */   
/* 61:   */   public void setCreatedby(Long createdby)
/* 62:   */   {
/* 63:59 */     this.createdby = createdby;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public Date getCreationtime()
/* 67:   */   {
/* 68:63 */     return this.creationtime;
/* 69:   */   }
/* 70:   */   
/* 71:   */   public void setCreationtime(Date creationtime)
/* 72:   */   {
/* 73:67 */     this.creationtime = creationtime;
/* 74:   */   }
/* 75:   */   
/* 76:   */   public Long getModifyby()
/* 77:   */   {
/* 78:71 */     return this.modifyby;
/* 79:   */   }
/* 80:   */   
/* 81:   */   public void setModifyby(Long modifyby)
/* 82:   */   {
/* 83:75 */     this.modifyby = modifyby;
/* 84:   */   }
/* 85:   */   
/* 86:   */   public Date getModifydate()
/* 87:   */   {
/* 88:79 */     return this.modifydate;
/* 89:   */   }
/* 90:   */   
/* 91:   */   public void setModifydate(Date modifydate)
/* 92:   */   {
/* 93:83 */     this.modifydate = modifydate;
/* 94:   */   }
/* 95:   */   
/* 96:   */   public String toString()
/* 97:   */   {
/* 98:88 */     return 
/* 99:   */     
/* :0:   */ 
/* :1:91 */       "appCategory [id=" + this.id + ", categorycode=" + this.categorycode + ", categoryname=" + this.categoryname + ", parentid=" + this.parentid + ", createdby=" + this.createdby + ", creationtime=" + this.creationtime + ", modifyby=" + this.modifyby + ", modifydate=" + this.modifydate + "]";
/* :2:   */   }
/* :3:   */ }


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.pojo.appCategory
 * JD-Core Version:    0.7.0.1
 */