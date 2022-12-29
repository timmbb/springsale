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
public class ProductController {

    @Resource
    private productService productService;
    @RequestMapping("tosaProduct")
    public String tosaProduct(Model model){
        List<product> products = productService.productList();
        model.addAttribute("pages", products);
        return "sa_product";
    }

    @RequestMapping("toSelectp")
    public String toSelect(){
        return "sa_prfind";
    }
    @RequestMapping(value = "/selectp",method = RequestMethod.POST)
    public String productselect(String pid, Model model ) {
        product products = productService.select(pid);
        model.addAttribute("pages", products);
        return "sa_prfind";
    }

    @RequestMapping(value = "/selectpe",method = RequestMethod.POST)
    public String productselecte(String pid, Model model ) {
        product products = productService.select(pid);
        model.addAttribute("pages", products);
        return "sa_prrev";
    }

    @RequestMapping(value = "/deletep",method = RequestMethod.POST)
    public String productdelete(String[] pids,Model model ) {//,String Id,
        for(String pid:pids){
            productService.delete(pid);
        }
        List<product> products = productService.productList();
        model.addAttribute("pages", products);
        return "sa_product";
    }
    @RequestMapping("toAddp")
    public String toAdd(){
        return "sa_pradd";
    }

    @RequestMapping(value = "/addp",method = RequestMethod.POST)
    public String productadd(product product,Model model ) {//,String Id,
        productService.add(product);
        List<product> products = productService.productList();
        model.addAttribute("pages", products);
        return "sa_product";
    }

    @RequestMapping("toUpdatep")
    public String toUpdate(){
        return "sa_prrev";
    }

    @RequestMapping(value = "/updatep",method = RequestMethod.POST)
    public String userupdate(product product,Model model ) {//,String Id,
        productService.update(product);
        List<product> products = productService.productList();
        model.addAttribute("pages", products);
        return "sa_product";
    }

}
