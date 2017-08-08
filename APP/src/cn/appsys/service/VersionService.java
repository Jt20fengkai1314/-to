package cn.appsys.service;

import cn.appsys.pojo.appVersion;
import java.util.List;

public abstract interface VersionService
{
  public abstract List<appVersion> VersionQueryAll();
  
  public abstract int VersionAdd(appVersion paramappVersion);
}


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.service.VersionService
 * JD-Core Version:    0.7.0.1
 */