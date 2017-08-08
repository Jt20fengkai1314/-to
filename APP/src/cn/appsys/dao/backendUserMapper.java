package cn.appsys.dao;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.appInfo;
import cn.appsys.pojo.appVersion;
import cn.appsys.pojo.backendUser;

public interface backendUserMapper
{	//审核不通过
	public int NoPass(Integer id);
	
	//审核通过
	public int Pass(@Param("id")Integer id);
	
	//查询总记录数
	public int count(@Param("ai")appInfo ai);
	
	//管理员登录
	public backendUser HTlogin(@Param("userCode")String userCode);
	
	//根据info表的Versionid来查询版本信息
	public appVersion Version(@Param("Versionid")Long Versionid);
	  
	//根据ID查询appInfo信息
	public appInfo info(Integer id);
  
 /* public abstract int insert(backendUser parambackendUser);
  
  public abstract int insertSelective(backendUser parambackendUser);
  
  public abstract backendUser selectByPrimaryKey(Long paramLong);
  
  public abstract int updateByPrimaryKeySelective(backendUser parambackendUser);
  
  public abstract int updateByPrimaryKey(backendUser parambackendUser);*/
}


/* Location:           D:\java\
 * Qualified Name:     cn.appsys.dao.backendUserMapper
 * JD-Core Version:    0.7.0.1
 */