package com.example.springbootdemo.servicelmpl;

import com.example.springbootdemo.bean.admin;
import com.example.springbootdemo.mapper.adminmapper;
import com.example.springbootdemo.service.adminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class adminServiceimpl implements adminService{
    @Resource
    private adminmapper admapper;
    @Override
    public admin logIn(String AdminUser, String AdminPass)
    {
        return admapper.getIn(AdminUser, AdminPass);
    }
}
