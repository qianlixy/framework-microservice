package com.qianlixy.framework.microservice.web.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@Value("${spring.application.name}")
	private String appName;
	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/")
	public String index() {
		return appName + ":" + port;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
