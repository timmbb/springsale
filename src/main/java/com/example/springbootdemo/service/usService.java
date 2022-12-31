package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.user;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface usService {
    user logIn(String UserName, String PassWord);

    List<user> userList();
    List<user> sauserList(String sname);

    user select(String Id);

    user delete(String Id);

    void add(user users);

    void update(user users);
}
