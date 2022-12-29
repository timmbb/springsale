package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.service.usService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Controller
public class AdUserController {

    @Resource
    private usService usService;
/*
    @RequestMapping(value = "/toPage",method = RequestMethod.GET)
    public String toPage(HttpServletRequest request){
        String url=request.getParameter("url");
        return url;
    }*/

    @RequestMapping("toadCustomer")
    public String toadCustomer(Model model) {
        List<user> users = usService.userList();
        model.addAttribute("pages", users);
        return "ad_customer";
    }

    @RequestMapping("toadSelect")
    public String toSelect(){
        return "ad_cufind";
    }
    @RequestMapping(value = "/adselect",method = RequestMethod.POST)
    public String userselect(String Id, Model model ) {
        user users = usService.select(Id);
        model.addAttribute("pages", users);
        return "ad_cufind";
    }

    @RequestMapping(value = "/adselecte",method = RequestMethod.POST)
    public String userselecte(String Id, Model model ) {
        user users = usService.select(Id);
        model.addAttribute("pages", users);
        return "ad_curev";
    }

    @RequestMapping(value = "/addelete",method = RequestMethod.POST)
    public String userdelete(String[] ids,Model model ) {//,String Id,
        for(String id:ids){
            usService.delete(id);
        }
        List<user> users = usService.userList();
        model.addAttribute("pages", users);
        return "ad_customer";
    }

    @RequestMapping("toadAdd")
    public String toAdd(){
        return "ad_cuadd";
    }

    @RequestMapping(value = "/adadd",method = RequestMethod.POST)
    public String useradd(user user,Model model ) {//,String Id,
        usService.add(user);
        List<user> users = usService.userList();
        model.addAttribute("pages", users);
        return "ad_customer";
    }

    @RequestMapping("toadUpdate")
    public String toUpdate(){
        return "ad_curev";
    }

    @RequestMapping(value = "/adupdate",method = RequestMethod.POST)
    public String userupdate(user user,Model model ) {//,String Id,
        usService.update(user);
        List<user> users = usService.userList();
        model.addAttribute("pages", users);
        return "ad_customer";
    }

}
