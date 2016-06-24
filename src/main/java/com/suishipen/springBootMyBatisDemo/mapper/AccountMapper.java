package com.suishipen.springBootMyBatisDemo.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.suishipen.springBootMyBatisDemo.model.Account;

@Mapper
public interface AccountMapper {
	int add(Account account);
}
