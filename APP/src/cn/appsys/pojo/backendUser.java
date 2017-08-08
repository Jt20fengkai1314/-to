/*  1:   */ package cn.appsys.pojo;
/*  2:   */ 
/*  3:   */ import java.util.Date;
/*  4:   */ 
/*  5:   */ public class backendUser
/*  6:   */ {
/*  7:   */   private Long id;
/*  8:   */   private String usercode;
/*  9:   */   private String username;
/* 10:   */   private Long usertype;
/* 11:   */   private Long createdby;
/* 12:   */   private Date creationdate;
/* 13:   */   private Long modifyby;
/* 14:   */   private Date modifydate;
/* 15:   */   private String userpassword;
/* 16:   */   
/* 17:   */   public Long getId()
/* 18:   */   {
/* 19:25 */     return this.id;
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void setId(Long id)
/* 23:   */   {
/* 24:29 */     this.id = id;
/* 25:   */   }
/* 26:   */   
/* 27:   */   public String getUsercode()
/* 28:   */   {
/* 29:33 */     return this.usercode;
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void setUsercode(String usercode)
/* 33:   */   {
/* 34:37 */     this.usercode = (usercode == null ? null : usercode.trim());
/* 35:   */   }
/* 36:   */   
/* 37:   */   public String getUsername()
/* 38:   */   {
/* 39:41 */     return this.username;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void setUsername(String username)
/* 43:   */   {
/* 44:45 */     this.username = (username == null ? null : username.trim());
/* 45:   */   }
/* 46:   */   
/* 47:   */   public Long getUsertype()
/* 48:   */   {
/* 49:49 */     return this.usertype;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void setUsertype(Long usertype)
/* 53:   */   {
/* 54:53 */     this.usertype = usertype;
/* 55:   */   }
/* 56:   */   
/* 57:   */   public Long getCreatedby()
/* 58:   */   {
/* 59:57 */     return this.createdby;
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void setCreatedby(Long createdby)
/* 63:   */   {
/* 64:61 */     this.createdby = createdby;
/* 65:   */   }
/* 66:   */   
/* 67:   */   public Date getCreationdate()
/* 68:   */   {
/* 69:65 */     return this.creationdate;
/* 70:   */   }
/* 71:   */   
/* 72:   */   public void setCreationdate(Date creationdate)
/* 73:   */   {
/* 74:69 */     this.creationdate = creationdate;
/* 75:   */   }
/* 76:   */   
/* 77:   */   public Long getModifyby()
/* 78:   */   {
/* 79:73 */     return this.modifyby;
/* 80:   */   }
/* 81:   */   
/* 82:   */   public void setModifyby(Long modifyby)
/* 83:   */   {
/* 84:77 */     this.modifyby = modifyby;
/* 85:   */   }
/* 86:   */   
/* 87:   */   public Date getModifydate()
/* 88:   */   {
/* 89:81 */     return this.modifydate;
/* 90:   */   }
/* 91:   */   
/* 92:   */   public void setModifydate(Date modifydate)
/* 93:   */   {
/* 94:85 */     this.modifydate = modifydate;
/* 95:   */   }
/* 96:   */   
/* 97:   */   public String getUserpassword()
/* 98:   */   {
/* 99:89 */     return this.userpassword;
/* :0:   */   }
/* :1:   */   
/* :2:   */   public void setUserpassword(String userpassword)
/* :3:   */   {
/* :4:93 */     this.userpassword = (userpassword == null ? null : userpassword.trim());
/* :5:   */   }
				@Override
				public String toString() {
					return "backendUser [id=" + id + ", usercode=" + usercode + ", username="
							+ username + ", usertype=" + usertype + ", createdby=" + createdby
							+ ", creationdate=" + creationdate + ", modifyby=" + modifyby
							+ ", modifydate=" + modifydate + ", userpassword=" + userpassword
							+ "]";
				}


/* :6:   */ }


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.pojo.backendUser
 * JD-Core Version:    0.7.0.1
 */