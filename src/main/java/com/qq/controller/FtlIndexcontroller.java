package com.qq.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * 整合freeMarker
 * @author hasee
 *
 */
@Controller
public class FtlIndexcontroller {

	@RequestMapping("/ftlIndex")
	public String ftlIndex(Map<String,Object> map){
		map.put("name", "qq");
		map.put("age", "23");
		map.put("sex", "0");
		return "ftlIndex";
	}
}
