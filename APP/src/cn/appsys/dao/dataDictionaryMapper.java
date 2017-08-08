package cn.appsys.dao;

import cn.appsys.pojo.dataDictionary;

public abstract interface dataDictionaryMapper
{
  public abstract int deleteByPrimaryKey(Long paramLong);
  
  public abstract int insert(dataDictionary paramdataDictionary);
  
  public abstract int insertSelective(dataDictionary paramdataDictionary);
  
  public abstract dataDictionary selectByPrimaryKey(Long paramLong);
  
  public abstract int updateByPrimaryKeySelective(dataDictionary paramdataDictionary);
  
  public abstract int updateByPrimaryKey(dataDictionary paramdataDictionary);
}


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.dao.dataDictionaryMapper
 * JD-Core Version:    0.7.0.1
 */