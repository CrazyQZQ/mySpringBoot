package com.qq.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class MemberSrevice {
	
	//添加用户时发送邮件
	@Async//相当于这个方法是单独的线程执行（重新弄开启单独线程）
	public String addMemberAndEmail(){
		log.info("2");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("3");
		return "qq";
	}
}
