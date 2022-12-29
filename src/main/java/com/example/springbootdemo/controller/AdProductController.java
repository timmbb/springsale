package com.example.springbootdemo.controller;
import com.example.springbootdemo.bean.product;
import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.service.productService;
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
public class AdProductController {

    @Resource
    private productService productService;
    @RequestMapping("toadProduct")
    public String toadProduct(Model model){
        List<product> products = productService.productList();
        model.addAttribute("pages", products);
        return "ad_product";
    }

    @RequestMapping("toadSelectp")
    public String toadSelect(){
        return "ad_prfind";
    }
    @RequestMapping(value = "/adselectp",method = RequestMethod.POST)
    public String adproductselect(String pid, Model model ) {
        product products = productService.select(pid);
        model.addAttribute("pages", products);
        return "ad_prfind";
    }

    @RequestMapping(value = "/addeletep",method = RequestMethod.POST)
    public String adproductdelete(String[] pids,Model model ) {//,String Id,
        for(String pid:pids){
            productService.delete(pid);
        }
        List<product> products = productService.productList();
        model.addAttribute("pages", products);
        return "ad_product";
    }
    @RequestMapping("toadAddp")
    public String toadAdd(){
        return "ad_pradd";
    }

    @RequestMapping(value = "/adaddp",method = RequestMethod.POST)
    public String adproductadd(product product,Model model ) {//,String Id,
        productService.add(product);
        List<product> products = productService.productList();
        model.addAttribute("pages", products);
        return "ad_product";
    }

    @RequestMapping("toadUpdatep")
    public String toadUpdatep(){
        return "ad_prrev";
    }

    @RequestMapping(value = "/adupdatep",method = RequestMethod.POST)
    public String adproductupdate(product product,Model model ) {//,String Id,
        productService.update(product);
        List<product> products = productService.productList();
        model.addAttribute("pages", products);
        return "ad_product";
    }

}
