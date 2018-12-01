package com.qq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * springboot第一个案例
 * @author hasee
 *
 */
@RestController
public class MenmberController {
	//@RestController 等同于RequestMapping+responseBody
	//springboot启动原理：springmvc的注解启动 内置http服务器（默认tomcat）
	@RequestMapping("/memberIndex")
	public String memberIndex(){
		return "hello world";
	}
}
