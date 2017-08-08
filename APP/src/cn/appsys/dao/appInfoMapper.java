package cn.appsys.dao;

import cn.appsys.pojo.appInfo;
import org.apache.ibatis.annotations.Param;

public abstract interface appInfoMapper
{
  public abstract int UnShelve(@Param("id") Integer paramInteger);
  
  public abstract int Putaway(@Param("id") Integer paramInteger);
  
  public abstract int InfoDelete(Integer paramInteger);
  
  public abstract int appInfoAdd(appInfo paramappInfo);
  
  public abstract int InfoUpdata(appInfo paramappInfo);
}


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.dao.appInfoMapper
 * JD-Core Version:    0.7.0.1
 */