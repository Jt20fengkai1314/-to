/*  1:   */ package cn.appsys.pojo;
/*  2:   */ 
/*  3:   */ import java.util.Date;
/*  4:   */ 
/*  5:   */ public class dataDictionary
/*  6:   */ {
/*  7:   */   private Long id;
/*  8:   */   private String typecode;
/*  9:   */   private String typename;
/* 10:   */   private Long valueId;
/* 11:   */   private String valueName;
/* 12:   */   private Long createdby;
/* 13:   */   private Date creationdate;
/* 14:   */   private Long modifyby;
/* 15:   */   private Date modifydate;
/* 16:   */   
/* 17:   */   public Long getValueId()
/* 18:   */   {
/* 19:13 */     return this.valueId;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setValueId(Long valueId)
/* 23:   */   {
/* 24:17 */     this.valueId = valueId;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getValueName()
/* 28:   */   {
/* 29:21 */     return this.valueName;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setValueName(String valueName)
/* 33:   */   {
/* 34:25 */     this.valueName = valueName;
/* 35:   */   }
/* 36:   */   
/* 37:   */   public Long getId()
/* 38:   */   {
/* 39:41 */     return this.id;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setId(Long id)
/* 43:   */   {
/* 44:45 */     this.id = id;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public String getTypecode()
/* 48:   */   {
/* 49:49 */     return this.typecode;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void setTypecode(String typecode)
/* 53:   */   {
/* 54:53 */     this.typecode = (typecode == null ? null : typecode.trim());
/* 55:   */   }
/* 56:   */   
/* 57:   */   public String getTypename()
/* 58:   */   {
/* 59:57 */     return this.typename;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void setTypename(String typename)
/* 63:   */   {
/* 64:61 */     this.typename = (typename == null ? null : typename.trim());
/* 65:   */   }
/* 66:   */   
/* 67:   */   public Long getCreatedby()
/* 68:   */   {
/* 69:66 */     return this.createdby;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public void setCreatedby(Long createdby)
/* 73:   */   {
/* 74:70 */     this.createdby = createdby;
/* 75:   */   }
/* 76:   */   
/* 77:   */   public Date getCreationdate()
/* 78:   */   {
/* 79:74 */     return this.creationdate;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public void setCreationdate(Date creationdate)
/* 83:   */   {
/* 84:78 */     this.creationdate = creationdate;
/* 85:   */   }
/* 86:   */   
/* 87:   */   public Long getModifyby()
/* 88:   */   {
/* 89:82 */     return this.modifyby;
/* 90:   */   }
/* 91:   */   
/* 92:   */   public void setModifyby(Long modifyby)
/* 93:   */   {
/* 94:86 */     this.modifyby = modifyby;
/* 95:   */   }
/* 96:   */   
/* 97:   */   public Date getModifydate()
/* 98:   */   {
/* 99:90 */     return this.modifydate;
/* :0:   */   }
/* :1:   */   
/* :2:   */   public void setModifydate(Date modifydate)
/* :3:   */   {
/* :4:94 */     this.modifydate = modifydate;
/* :5:   */   }
/* :6:   */ }


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.pojo.dataDictionary
 * JD-Core Version:    0.7.0.1
 */