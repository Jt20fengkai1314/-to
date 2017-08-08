package cn.appsys.dao;

import cn.appsys.pojo.appCategory;

public abstract interface appCategoryMapper
{
  public abstract int deleteByPrimaryKey(Long paramLong);
  
  public abstract int insert(appCategory paramappCategory);
  
  public abstract int insertSelective(appCategory paramappCategory);
  
  public abstract appCategory selectByPrimaryKey(Long paramLong);
  
  public abstract int updateByPrimaryKeySelective(appCategory paramappCategory);
  
  public abstract int updateByPrimaryKey(appCategory paramappCategory);
}


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.dao.appCategoryMapper
 * JD-Core Version:    0.7.0.1
 */