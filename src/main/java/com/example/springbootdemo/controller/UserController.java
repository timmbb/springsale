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
public class UserController {

    @Resource
    private usService usService;

    @RequestMapping(value = "/toPage",method = RequestMethod.GET)
    public String toPage(HttpServletRequest request){
        String url=request.getParameter("url");
        return url;
    }

    @RequestMapping("tosaCustomer")
    public String tosaCustomer(Model model) {
        List<user> users = usService.userList();
        model.addAttribute("pages", users);
        return "sa_customer";
    }

    @RequestMapping("toSelect")
    public String toSelect(){
        return "sa_cufind";
    }
    @RequestMapping(value = "/select",method = RequestMethod.POST)
    public String userselect(String Id, Model model ) {
        user users = usService.select(Id);
        model.addAttribute("pages", users);
        return "sa_cufind";
    }

    @RequestMapping(value = "/delete",method = RequestMethod.POST)
    public String userdelete(String[] ids,Model model ) {//,String Id,
        for(String id:ids){
            usService.delete(id);
        }
        List<user> users = usService.userList();
        model.addAttribute("pages", users);
        return "sa_customer";
    }
    @RequestMapping("toAdd")
    public String toAdd(){
        return "sa_cuadd";
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String useradd(user user,Model model ) {//,String Id,
        usService.add(user);
        List<user> users = usService.userList();
        model.addAttribute("pages", users);
        return "sa_customer";
    }

    @RequestMapping("toUpdate")
    public String toUpdate(){
        return "sa_curev";
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public String userupdate(user user,Model model ) {//,String Id,
        usService.update(user);
        List<user> users = usService.userList();
        model.addAttribute("pages", users);
        return "sa_customer";
    }

}
