package com.qianlixy.framework.microservice.web.demo.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	
	@Value("${spring.application.name}")
	private String serverName;
	@Value("${server.port}")
	private String port;
	
	@RequestMapping("/")
	public String index() {
		String address = null;
		try {
			address = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
			address = serverName;
		}
		return address + ":" + port;
	}

}
