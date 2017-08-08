package cn.appsys.service;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.appsys.dao.backendUserMapper;
import cn.appsys.pojo.appInfo;
import cn.appsys.pojo.appVersion;
import cn.appsys.pojo.backendUser;
import cn.appsys.tools.ResultData;

@Service
@Transactional
public class BackendUserServiceImpl implements BackendUserService {
	
	@Resource
	private backendUserMapper bUserMapper;
	
	//登录
	@Override
	public ResultData HTlogin(String userCode,String userPassword) {
		ResultData rd=new ResultData();
	    backendUser buser=bUserMapper.HTlogin(userCode);
	    
	    if(buser==null){
	    	rd.setFlag(1);
	    	rd.setMsg("用户名错误！");
	    }else{
	    	if(!userPassword.equals(buser.getUserpassword())){
	    		rd.setFlag(2);
	    		rd.setMsg("密码错误!");
	    	}else{
	    		rd.setFlag(0);
	    		rd.setData(buser);
	    	}
	    }
		return rd;
	}

	//查询总记录数
	public int count(appInfo ai) {
		return bUserMapper.count(ai);
	}

	//根据ID查询appInfo信息
	public appInfo info(Integer id) {
		return bUserMapper.info(id);
	}

	//根据info表的Versionid来查询版本信息
	public appVersion Version(Long Versionid) {
		return bUserMapper.Version(Versionid);
	}

	//审核不通过
	public int NoPass(Integer id) {
		
		return bUserMapper.NoPass(id);
	}

	//审核通过
	public int Pass(Integer id) {
		
		return bUserMapper.Pass(id);
	}
}
