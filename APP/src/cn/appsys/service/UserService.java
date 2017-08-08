package cn.appsys.service;

import cn.appsys.pojo.appCategory;
import cn.appsys.pojo.appInfo;
import cn.appsys.pojo.dataDictionary;
import cn.appsys.tools.ResultData;
import java.util.List;
import java.util.Map;

public abstract interface UserService
{
  public abstract int count(appInfo paramappInfo);
  
  public abstract List<appCategory> ThirdClassification(Integer paramInteger);
  
  public abstract List<appCategory> SecondaryClassification(Integer paramInteger);
  
  public abstract List<appCategory> FirstClassifying();
  
  public abstract List<dataDictionary> getAllBy(String paramString);
  
  public abstract ResultData deleteByPrimaryKey(String paramString1, String paramString2);
  
  public abstract List<appInfo> QueryAll(Map<String, Object> paramMap, appInfo paramappInfo);
}


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.service.UserService
 * JD-Core Version:    0.7.0.1
 */