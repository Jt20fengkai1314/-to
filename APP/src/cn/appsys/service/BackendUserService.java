package cn.appsys.service;



import cn.appsys.pojo.appInfo;
import cn.appsys.pojo.appVersion;
import cn.appsys.tools.ResultData;

public interface BackendUserService {
	
	//审核不通过
	public int NoPass(Integer id);
	
	//审核通过
	public int Pass(Integer id);
	
	//登陆
	public ResultData HTlogin(String userCode,String userPassword);
	
	//查询总记录数
	public int count(appInfo ai);
	
	//根据info表的Versionid来查询版本信息
		public appVersion Version(Long Versionid);
	
	
	//根据ID查询appInfo信息
	public appInfo info(Integer id);
}
