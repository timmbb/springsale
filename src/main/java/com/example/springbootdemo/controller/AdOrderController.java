package com.example.springbootdemo.controller;
import com.example.springbootdemo.bean.orders;
import com.example.springbootdemo.bean.sales;
import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.service.ordersService;
import com.example.springbootdemo.service.salesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Controller
public class AdOrderController {

    @Resource
    private ordersService orderService;
    @Resource
    private salesService salesService;

    @RequestMapping("toadOrder")
    public String toadOrder(Model model){
        List<orders> orders = orderService.ordersList();
        model.addAttribute("pages", orders);
        return "ad_order";
    }

    @RequestMapping("toadSelecto")
    public String toadSelect(){
        return "ad_orfind";
    }
    @RequestMapping(value = "/adselecto",method = RequestMethod.POST)
    public String adorderselect(String oid, Model model ) {
        orders orders = orderService.selectself(oid);
        model.addAttribute("pages", orders);
        return "ad_orfind";
    }

    @RequestMapping(value = "/adselectoe",method = RequestMethod.POST)
    public String adorderselecte(String oid, Model model ) {
        orders orders = orderService.selectself(oid);
        model.addAttribute("pages", orders);
        return "ad_orrev";
    }

    @RequestMapping(value = "/addeleteo",method = RequestMethod.POST)
    public String adorderdelete(String[] oids,Model model ) {//,String Id,
        for(String oid:oids){
            orderService.delete(oid);
        }
        List<orders> orders = orderService.ordersList();
        model.addAttribute("pages", orders);
        return "ad_order";
    }
    @RequestMapping("toadAddo")
    public String toadAdd(){
        return "ad_oradd";
    }

    @RequestMapping(value = "/adaddo",method = RequestMethod.POST)
    public String adorderadd(orders order,Model model ) {//,String Id,
        orderService.add(order);
        List<orders> orders = orderService.ordersList();
        model.addAttribute("pages", orders);
        return "ad_order";
    }

    @RequestMapping("toadUpdateo")
    public String toadUpdate(){
        return "ad_orrev";
    }

    @RequestMapping(value = "/adupdateo",method = RequestMethod.POST)
    public String adorderupdate(orders order,Model model ) {//,String Id,
        orderService.update(order);
        List<orders> orders = orderService.ordersList();
        model.addAttribute("pages", orders);
        return "ad_order";
    }
/*
    @RequestMapping("toadSales")
    public String toadSales(){
        return "adusers";
    }

    @RequestMapping("toSelectad")
    public String toSelectad(Model model, HttpSession session) {//,String Id,
//        String sname =(String) session.getAttribute("sname");
        List<sales> sales=salesService.salesList();
//        List<orders> orders = orderService.ordersList();
        model.addAttribute("pages", sales);
        return "adusers";
    }
    @RequestMapping("toUpdatead")
    public String toUpdatead(){
        return "aduserrev";
    }

    @RequestMapping(value = "/updatead",method = RequestMethod.POST)
    public String adsalesupdate(sales sales,Model model,HttpSession session) {//,String Id,
        String sname =(String) session.getAttribute("sname");
        salesService.update(sales);
        sales sales1 = salesService.select(sname);
//        List<orders> orders = orderService.ordersList();
        model.addAttribute("pages", sales1);
        return "adusers";
    }*/

}
