package cn.appsys.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import cn.appsys.pojo.backendUser;


/*public class LoginFilter extends HandlerInterceptorAdapter {
	public boolean preHandle(HttpServletRequest request,HttpServletResponse response,Object handler) throws Exception{
		
		HttpSession session = request.getSession();
		
		backendUser bUser = (cn.appsys.pojo.backendUser) session.getAttribute("bUser");
		//DevUser devUser = (DevUser)session.getAttribute("devUser");
		
		if(null != devUser){ //dev SUCCESS
			return true;
		}else
		if(null != bUser){ //backend SUCCESS
			return true;
		}else{
			response.sendRedirect(request.getContextPath()+"/HT403.jsp");
			return false;
		}
		
	}

}*/

public class LoginFilter implements Filter {
	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException { 
		
		String url = ((HttpServletRequest) request).getRequestURI();
		System.out.println("======:" + url);
		
		if ((url.indexOf("HTlogin") >= 0)||(url.indexOf("index") >= 0)||
			(url.indexOf("build") >= 0)||(url.indexOf("vendors") >= 0)||(url.indexOf("403") >= 0)){
			
			chain.doFilter(request, response);
		} else if (((HttpServletRequest) request).getSession().getAttribute("bUser") == null){
			((HttpServletResponse) response).sendRedirect("BackendUser/HT403");
		} else {
			chain.doFilter(request, response);
		}
	}

	public void init(FilterConfig arg0) throws ServletException {

	}
}