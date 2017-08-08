/*  1:   */ package cn.appsys.tools;
/*  2:   */ 
/*  3:   */ import java.io.Serializable;
/*  4:   */ 
/*  5:   */ public class ResultData
/*  6:   */   implements Serializable
/*  7:   */ {
/*  8:   */   private static final long serialVersionUID = 4528474935088501635L;
/*  9:   */   private String msg;
/* 10:   */   private int flag;
/* 11:   */   private Object data;
/* 12:   */   
/* 13:   */   public String getMsg()
/* 14:   */   {
/* 15:12 */     return this.msg;
/* 16:   */   }
/* 17:   */   
/* 18:   */   public void setMsg(String msg)
/* 19:   */   {
/* 20:15 */     this.msg = msg;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public int getFlag()
/* 24:   */   {
/* 25:18 */     return this.flag;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public void setFlag(int flag)
/* 29:   */   {
/* 30:21 */     this.flag = flag;
/* 31:   */   }
/* 32:   */   
/* 33:   */   public Object getData()
/* 34:   */   {
/* 35:24 */     return this.data;
/* 36:   */   }
/* 37:   */   
/* 38:   */   public void setData(Object data)
/* 39:   */   {
/* 40:27 */     this.data = data;
/* 41:   */   }
/* 42:   */ }


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.tools.ResultData
 * JD-Core Version:    0.7.0.1
 */