package com.qq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;


//@EnableAutoConfiguration//扫包范围：当前类
//@ComponentScan("com.qq.controller")//包比较多写起来比较麻烦
@SpringBootApplication
@EnableAsync//开启异步调用
public class App {
	public static void main(String[] args) {
		//整个程序入口
		SpringApplication.run(App.class, args);
	}
}
