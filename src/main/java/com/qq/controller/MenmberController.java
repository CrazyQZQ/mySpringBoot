package com.qq.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qq.service.MemberSrevice;

/**
 * springboot第一个案例
 * @author hasee
 *
 */
@Slf4j
@RestController
public class MenmberController {
	@Value("${name}")
	private String name;
	@Value("${http_url}")
	private String http_url;
	
	@Autowired
	private MemberSrevice memberSrevice;
	//@RestController 等同于RequestMapping+responseBody
	//springboot启动原理：springmvc的注解启动 内置http服务器（默认tomcat）
	@RequestMapping("/memberIndex")
	public String memberIndex(){
		return "hello world";
	}
	
	//添加用户时发送邮件
	@RequestMapping("/addMemberAndEmail")
	public String addMemberAndEmail(){
		log.info("1");
		String result = memberSrevice.addMemberAndEmail();
		log.info("4");
		return result;
	}
	
	@RequestMapping("/getName")
	public String getName(){
		return name;
	}
	
	
	@RequestMapping("/getHttp_url")
	public String getHttp_url(){
		return http_url;
	}
}
