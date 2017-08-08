/*  1:   */package cn.appsys.controller;

/*  2:   */
/*  3:   */import cn.appsys.dao.appInfoMapper;
/*  4:   */
import cn.appsys.pojo.appInfo;
/*  5:   */
import cn.appsys.service.InfoService;

import java.awt.BufferCapabilities.FlipContents;
import java.io.File;
import java.io.IOException;
/*  6:   */
import java.util.Date;
import java.util.UUID;

/*  7:   */
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/*  8:   */
import org.springframework.beans.factory.annotation.Autowired;
/*  9:   */
import org.springframework.stereotype.Controller;
/* 10:   */
import org.springframework.web.bind.annotation.PathVariable;
/* 11:   */
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

/* 12:   */
/* 13:   */@Controller
/* 14: */@RequestMapping({ "/appInfo" })
/* 15: */public class InfoController
/* 16: */{
	/* 17: */@Autowired
	/* 18: */private InfoService iService;
	/* 19: */@Resource
	/* 20: */private appInfoMapper aMapper;

	/* 21: */
	/* 22: */@RequestMapping({ "/UnShelve/{id}" })
	/* 23: */public String UnShelve(@PathVariable("id") Integer id)
	/* 24: */{
		/* 25:28 */int len = this.aMapper.UnShelve(id);
		/* 26:29 */if (len <= 0) {
			/* 27:30 */return "";
			/* 28: */}
		/* 29:32 */return "redirect:/user/userList/1";
		/* 30: */}

	/* 31: */
	/* 32: */@RequestMapping({ "/Putaway/{id}" })
	/* 33: */public String Putaway(@PathVariable("id") Integer id)
	/* 34: */{
		/* 35:38 */int len = this.aMapper.Putaway(id);
		/* 36:39 */if (len <= 0) {
			/* 37:40 */return "";
			/* 38: */}
		/* 39:42 */return "redirect:/user/userList/1";
		/* 40: */}

	/* 41: */
	/* 42: */@RequestMapping({ "/InfoDelete/{id}" })
	/* 43: */public String InfoDelete(@PathVariable("id") Integer id)
	/* 44: */{
		/* 45:49 */int len = this.aMapper.InfoDelete(id);
		/* 46:50 */if (len <= 0) {
			/* 47:51 */return "";
			/* 48: */}
		/* 49:53 */return "redirect:/user/userList/1";
		/* 50: */}

	//修改
	@RequestMapping("/InfoUpdata/{id}")
	public String InfoUpdata(@PathVariable("id")Integer id,appInfo ai,MultipartFile pic,HttpSession session) throws IllegalStateException, IOException{
		ai.setId(id);
		ai.setUpdateDate(new Date());
		// 判断文件是否为空
		if (!pic.isEmpty()){
			// 获取上传文件名
			String fileName = pic.getOriginalFilename();
			// 判断文件是否是一个合法图片
			if (fileName.endsWith("jpg") || fileName.endsWith("png")){
				// 获取上传目录
				String path = session.getServletContext().getRealPath("/TP");
				File f = new File(path + "/" + UUID.randomUUID().toString()+ fileName);
				// 保存
				pic.transferTo(f);
				ai.setLogoLocPath(f.toString());
				String url = "/"+ f.toString().substring(f.toString().lastIndexOf("webapps\\") + 8);
				ai.setLogoPicPath(url);
			}
		}
		int len = this.aMapper.InfoUpdata(ai);
		if (len <= 0) {
			return "redirect:/Version/VersionAppInfo/"+ai.getId();
		}
		return "redirect:/user/userList/1";
	}

	// 添加
	@RequestMapping(value = "/Add")
	public String appInfoAdd(appInfo info, MultipartFile pic,
			HttpSession session) throws IllegalStateException, IOException {
		info.setCreationDate(new Date());
		// 判断文件是否为空
		if (!pic.isEmpty()) {
			// 获取上传文件名
			String fileName = pic.getOriginalFilename();
			// 判断文件是否是一个合法图片
			if (fileName.endsWith("jpg") || fileName.endsWith("png")) {
				// 获取上传目录
				String path = session.getServletContext().getRealPath("/TP");
				File f = new File(path + "/" + UUID.randomUUID().toString()
						+ fileName);
				// 保存
				pic.transferTo(f);

				info.setLogoLocPath(f.toString());
				String url = "/"
						+ f.toString().substring(
								f.toString().lastIndexOf("webapps\\") + 8);
				info.setLogoPicPath(url);
			}
		}
		int len = this.iService.appInfoAdd(info);
		if (len < 0) {
			return "devUserAdd";
		}
		return "redirect:/user/userList/1";
	}
}
