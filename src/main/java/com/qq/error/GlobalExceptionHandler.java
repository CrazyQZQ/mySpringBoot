package com.qq.error;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局捕获异常：1、捕获返回json格式   2、捕获返回页面
 * @author hasee
 *
 */
@ControllerAdvice(basePackages="com.qq.controller")
public class GlobalExceptionHandler {

	@ResponseBody
	@ExceptionHandler(RuntimeException.class)
	public Map<String,Object> errorResult(){
		Map<String,Object> errorResultMap = new HashMap<String, Object>();
		errorResultMap.put("errorCode", "500");
		errorResultMap.put("errorMsg", "系统错误");
		return errorResultMap;
	}
}
