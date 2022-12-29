package com.example.springbootdemo.servicelmpl;

import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.mapper.usmapper;
import com.example.springbootdemo.service.usService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Optional;

@Service
public class usServiceimpl implements usService {
    @Resource
    private usmapper usermapper;

    public user logIn(String UserName, String PassWord)
    {
//        user user=usermapper.getInfo(UserName, PassWord);
//        if(user!=null){
//
//        }
        return usermapper.getInfo(UserName, PassWord);
    }

    public List<user> userList(){
        return usermapper.userList();
    }

    @Override
    public user select(String Id) { return usermapper.select(Id);}

    public user delete(String Id){return usermapper.delete(Id);}

    @Override
    public void add(user users) {
        usermapper.add(users);
    }

    @Override
    public void update(user users) {
        usermapper.update(users);
    }
}