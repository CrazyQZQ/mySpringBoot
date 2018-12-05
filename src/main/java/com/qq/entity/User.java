package com.qq.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
//@Getter
//@Setter
//@Slf4j//lombok一定要在开发工具内安装
@Data//相当于@Getter+@Setter
public class User {
	private Integer id;
	private String name;
	private Integer age;
	
	//lombok底层使用字节码技术 ASM 修改字节码文件 生成get/set方法
}
