package com.example.springbootdemo.controller;
import com.example.springbootdemo.bean.orders;
import com.example.springbootdemo.bean.sales;
import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.bean.admin;
import com.example.springbootdemo.service.ordersService;
import com.example.springbootdemo.service.salesService;
import com.example.springbootdemo.service.usService;
import com.example.springbootdemo.service.adminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import sun.plugin.dom.core.Element;
import sun.util.resources.cldr.ml.CalendarData_ml_IN;

import javax.servlet.http.HttpSession;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Controller
public class OrderController {

    @Resource
    usService userService;
    @Resource
    salesService salesService;
    @Resource
    adminService adminService;

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
    @RequestMapping("/admin_login")
    public String adshow(){return "admin_login";}

    @RequestMapping(value = "/logIn",method = RequestMethod.POST)
    public String adloginMethod(String AdminUser, String AdminPass, Model model)//
    {
        admin admin=adminService.logIn(AdminUser, AdminPass);
        List<user> users = userService.userList();
        model.addAttribute("pages", users);
        if (admin!=null)
        {
            return "ad_customer";
        }
        else
            return "error";
    }

    @Resource
    private ordersService orderService;
    @RequestMapping("tosaOrder")
    public String tosaOrder(Model model,HttpSession session){
        String sname =(String) session.getAttribute("sname");
        List<orders> orders = orderService.selectall(sname);
//        List<orders> orders = orderService.ordersList();
        model.addAttribute("pages", orders);
        return "sa_order";
    }
/*
    @RequestMapping("toSelecto")
    public String toSelect(){
        return "sa_orfind";
    }
    @RequestMapping(value = "/selecto",method = RequestMethod.POST)
    public String orderselect(Model model,HttpSession session) {//String oid, String sid,
        String sname =(String) session.getAttribute("sname");
        orders orders = orderService.selectall(sname);
        model.addAttribute("pages", orders);
        return "sa_orfind";
    }*/

    @RequestMapping(value = "/deleteo",method = RequestMethod.POST)
    public String orderdelete(String[] oids,Model model ,HttpSession session) {//,String Id,
        for(String oid:oids){
            orderService.delete(oid);
        }
        String sname =(String) session.getAttribute("sname");
        List<orders> orders = orderService.selectall(sname);
        model.addAttribute("pages", orders);
        return "sa_order";
    }
    @RequestMapping("toAddo")
    public String toAdd(){
        return "sa_oradd";
    }

    @RequestMapping(value = "/addo",method = RequestMethod.POST)
    public String orderadd(orders order,Model model ,HttpSession session) {//,String Id,
        String sname =(String) session.getAttribute("sname");
        orderService.add(order);
        List<orders> orders = orderService.selectall(sname);
        model.addAttribute("pages", orders);
        return "sa_order";
    }

    @RequestMapping("toUpdateo")
    public String toUpdate(){
        return "sa_orrev";
    }

    @RequestMapping(value = "/updateo",method = RequestMethod.POST)
    public String orderupdate(orders order,Model model,HttpSession session) {//,String Id,
        String sname =(String) session.getAttribute("sname");
        orderService.update(order);
        List<orders> orders = orderService.selectall(sname);
//        List<orders> orders = orderService.ordersList();
        model.addAttribute("pages", orders);
        return "sa_order";
    }

    @RequestMapping("tosaSales")
    public String tosaSales(){
        return "users";
    }

    @RequestMapping("toSelectsa")
    public String toSelectsa(Model model,HttpSession session) {//,String Id,
        String sname =(String) session.getAttribute("sname");
        sales sales=salesService.select(sname);
//        List<orders> orders = orderService.ordersList();
        model.addAttribute("pages", sales);
        return "users";
    }
    @RequestMapping("toUpdatesa")
    public String toUpdatesa(){
        return "userrev";
    }

    @RequestMapping(value = "/updatesa",method = RequestMethod.POST)
    public String salesupdate(sales sales,Model model,HttpSession session) {//,String Id,
        String sname =(String) session.getAttribute("sname");
        salesService.update(sales);
        sales sales1 = salesService.select(sname);
//        List<orders> orders = orderService.ordersList();
        model.addAttribute("pages", sales1);
        return "users";
    }
}
