package com.qq.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
	private Logger logger =LoggerFactory.getLogger(IndexController.class);
	@RequestMapping("/index")
	public String index(){
		logger.info("springboot集成log4j成功");
		return "indexController";
	}
}
