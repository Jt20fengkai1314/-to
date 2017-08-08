package cn.appsys.dao;

import cn.appsys.pojo.appCategory;
import cn.appsys.pojo.appInfo;
import cn.appsys.pojo.dataDictionary;
import cn.appsys.pojo.devUser;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public abstract interface devUserMapper
{
	
	
  public abstract int count(@Param("ai") appInfo paramappInfo);
  
  public abstract List<appCategory> ThirdClassification(Integer paramInteger);
  
  public abstract List<appCategory> SecondaryClassification(Integer paramInteger);
  
  public abstract List<appCategory> FirstClassifying();
  
  public abstract List<dataDictionary> getAllBy(String paramString);
  
  public abstract devUser deleteByPrimaryKey(String paramString);
  
  public abstract List<appInfo> QueryAll(@Param("map") Map<String, Object> paramMap, @Param("ai") appInfo paramappInfo);
}


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.dao.devUserMapper
 * JD-Core Version:    0.7.0.1
 */