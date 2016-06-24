package com.suishipen.springBootMyBatisDemo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.suishipen.springBootMyBatisDemo.model.User;

@Mapper
public interface UserMapper {
    List<User> findAll();
    List<User> findAllUser();
    int add(User user);
}
