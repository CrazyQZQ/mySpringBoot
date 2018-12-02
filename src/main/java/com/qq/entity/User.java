package com.qq.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
@Getter
@Setter
@Slf4j//lombok一定要在开发工具内安装
public class User {
	
	private String name;
	private Integer age;
	
	//lombok底层使用字节码技术 ASM 修改字节码文件 生成get/set方法
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Integer getAge() {
//		return age;
//	}
//	public void setAge(Integer age) {
//		this.age = age;
//	}
	
//	public static void main(String[] args) {
//		User u = new User();
//		u.setName("qq");
//		log.info(u.getName());
//	}
}
