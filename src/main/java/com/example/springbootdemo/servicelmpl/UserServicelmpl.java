package com.example.springbootdemo.servicelmpl;
import com.example.springbootdemo.bean.UserBean;
import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServicelmpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public UserBean logIn(String name,String password){
        return userMapper.getInfo(name, password);
    }
}
