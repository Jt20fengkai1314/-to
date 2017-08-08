package cn.appsys.dao;

import cn.appsys.pojo.appInfo;
import cn.appsys.pojo.appVersion;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public abstract interface appVersionMapper
{
  public abstract int VersionUpdate(@Param("av") appVersion paramappVersion);
  
  public abstract appVersion getIdQuery(@Param("id") Integer paramInteger);
  
  public abstract List<appVersion> VersionQueryAll();
  
  public abstract int VersionAdd(@Param("av") appVersion paramappVersion);
  
  public abstract appInfo IdQuery(@Param("id") Integer paramInteger);
}


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.dao.appVersionMapper
 * JD-Core Version:    0.7.0.1
 */