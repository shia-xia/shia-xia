package com.xia.emos.controller;

import com.xia.emos.entity.User;
import com.xia.emos.mapper.UserMapper;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    UserMapper userMapper;

    @GetMapping("/all")
    @ApiOperation(value = "查询所有用户的接口",
                    notes = "该接口返回所有的用户姓名，密码和权限")
    public List<User> getAll(){
        return userMapper.getAll();
    }
}
