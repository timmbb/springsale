package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.user;

import java.util.List;

public interface usmapper {
    user getInfo(String UserName, String PassWord);

    List<user> userList();

    user select(String Id);

    user delete(String Id);

    Integer add(user users);

    Integer update(user users);
}
