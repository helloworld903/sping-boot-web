package com.easy.web.common.filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j //@Slf4j是一个Lombok注解，它可以自动生成一个名为“log”的日志记录器变量，使得在类中使用日志记录器变得更加简单。
public class CustumFilter implements Filter{
	@Override
	public void init(FilterConfig filterConfig) throws ServletException{
		log.info("filter 初始化");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,ServletException{
		log.info("doFilter 请求处理");
		
		request.setCharacterEncoding("UTF-8");
		
		//todo 进行业务处理
		
		//传给下一个过滤器
		chain.doFilter(request, response);
	}
	
	@Override
	public void destroy() {
		log.info("filter 销毁");
	}
}
