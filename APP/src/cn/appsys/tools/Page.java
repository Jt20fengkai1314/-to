/*  1:   */ package cn.appsys.tools;
/*  2:   */ 
/*  3:   */ import java.io.Serializable;
/*  4:   */ 
/*  5:   */ public class Page
/*  6:   */   implements Serializable
/*  7:   */ {
/*  8:   */   private static final long serialVersionUID = 7723081444833563797L;
/*  9:   */   private Integer n;
/* 10:10 */   private Integer size = Integer.valueOf(5);
/* 11:   */   private Integer totalSize;
/* 12:   */   private Integer totalPage;
/* 13:   */   
/* 14:   */   public Integer getN()
/* 15:   */   {
/* 16:14 */     return this.n;
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void setN(Integer n)
/* 20:   */   {
/* 21:17 */     this.n = n;
/* 22:   */   }
/* 23:   */   
/* 24:   */   public Integer getSize()
/* 25:   */   {
/* 26:20 */     return this.size;
/* 27:   */   }
/* 28:   */   
/* 29:   */   public void setSize(Integer size)
/* 30:   */   {
/* 31:23 */     this.size = size;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public Integer getTotalSize()
/* 35:   */   {
/* 36:26 */     return this.totalSize;
/* 37:   */   }
/* 38:   */   
/* 39:   */   public void setTotalSize(Integer totalSize)
/* 40:   */   {
/* 41:29 */     this.totalSize = totalSize;
/* 42:   */   }
/* 43:   */   
/* 44:   */   public Integer getTotalPage()
/* 45:   */   {
/* 46:32 */     return this.totalPage;
/* 47:   */   }
/* 48:   */   
/* 49:   */   public void setTotalPage(Integer totalPage)
/* 50:   */   {
/* 51:35 */     this.totalPage = totalPage;
/* 52:   */   }
/* 53:   */ }


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.tools.Page
 * JD-Core Version:    0.7.0.1
 */