package com.easy.web.common.listener;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomSessionListener implements HttpSessionListener {
	public static int online=0;
	
	@Override
	public void sessionCreated(HttpSessionEvent hse) {
		System.out.print("创建session");
		online++;
		log.info("当前在线人数："+online);
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent hse) {
		System.out.println("销毁 session");
		
		//online--?
	}
}
