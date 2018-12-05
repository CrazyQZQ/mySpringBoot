package com.qq.service;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qq.entity.User;
import com.qq.mapper.UserMapper;

@Service
@Slf4j
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public User findByName(String name){
		return userMapper.findByName(name);
	}
	
	public int insert( String name,Integer age){
		int rows = userMapper.insert(name, age);
		log.info(rows+"");
		return rows;
	}
}
