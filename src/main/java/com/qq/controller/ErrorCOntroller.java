package com.qq.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 异常案例
 * @author qq
 *
 */
@RestController
public class ErrorCOntroller {

	@RequestMapping("/getUser")
	public String getUser(int i){
		int j = 1/i;
		return "success"+j;
	}
}
