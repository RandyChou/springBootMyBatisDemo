package com.suishipen.springBootMyBatisDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.suishipen.springBootMyBatisDemo.mapper.AccountMapper;
import com.suishipen.springBootMyBatisDemo.mapper.UserMapper;
import com.suishipen.springBootMyBatisDemo.model.User;
import com.suishipen.springBootMyBatisDemo.model.Account;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private AccountMapper accountMapper;
	
	@RequestMapping(value="", method = RequestMethod.GET)
	public List<User> findAllUser() {
		List<User> users = userMapper.findAll();
		return users;
	}
	
	@RequestMapping(value="", method = RequestMethod.POST)
	public User add(@RequestBody User user) {
		int count = userMapper.add(user);
		accountMapper.add(new Account(0, user));
		System.out.println("insert user:" + count);
		return user;
	}
}
