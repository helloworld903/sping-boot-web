package com.easy.web.common.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CustomRequestListener implements ServletRequestListener{
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		log.info("监听器：销毁");
	}
	
	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		log.info("监听器：初始化");
	}
}
