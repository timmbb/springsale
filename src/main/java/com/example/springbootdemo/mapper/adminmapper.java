package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.admin;

public interface adminmapper {
    admin getIn(String AdminUser, String AdminPass);
}
