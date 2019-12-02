package com.lzk.controller;

import com.lzk.dao.UserMapper;
import com.lzk.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Query {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/getUser")
    public User getUser(@Param("id") String id) {
        User user =userMapper.selectByPrimaryKey(1);
        return user;
    }

}