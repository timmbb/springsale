package com.example.springbootdemo.controller;

import com.example.springbootdemo.bean.sales;
import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.service.salesService;
import com.example.springbootdemo.service.usService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginController {
    /*
    @Resource
    usService userService;
    @Resource
    salesService salesService;

    @RequestMapping("/interface")
    public String show(){return "interface";}

    @RequestMapping(value = "/logInsa",method = RequestMethod.POST)
    public String loginMethod(String sname, String spassword, Model model, HttpSession session)//
    {
        sales sales=salesService.logIn(sname, spassword);
        List<user> users = userService.userList();
        model.addAttribute("pages", users);
        if (sales!=null)
        {
            session.setAttribute("sname",sales.getsname());
            return "sa_customer";
        }
        else
            return "error";
    }
*/
}
