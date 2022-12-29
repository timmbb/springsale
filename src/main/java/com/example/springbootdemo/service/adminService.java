package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.admin;

public interface adminService {
    admin logIn(String AdminUser, String AdminPass);
}
