package com.example.springbootdemo.controller;
import com.example.springbootdemo.bean.sales;
import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.service.salesService;
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
public class SalesController {

    @Resource
    private salesService salesService;

    @RequestMapping("toadSales")
    public String tosaSales(Model model){
        List<sales> saless = salesService.salesList();
        model.addAttribute("pages", saless);
        return "ad_salesman";
    }

    @RequestMapping("toadSelects")
    public String toSelect(){
        return "ad_safind";
    }
    @RequestMapping(value = "/adselects",method = RequestMethod.POST)
    public String salesselect(String sid, Model model ) {
        sales saless = salesService.selectself(sid);
        model.addAttribute("pages", saless);
        return "ad_safind";
    }

    @RequestMapping(value = "/adselectse",method = RequestMethod.POST)
    public String salesselecte(String sid, Model model ) {
        sales saless = salesService.selectself(sid);
        model.addAttribute("pages", saless);
        return "ad_sarev";
    }

    @RequestMapping(value = "/addeletes",method = RequestMethod.POST)
    public String adsalesdelete(String[] sids,Model model ) {//,String Id,
        for(String sid:sids){
            salesService.delete(sid);
        }
        List<sales> saless = salesService.salesList();
        model.addAttribute("pages", saless);
        return "ad_salesman";
    }
    @RequestMapping("toadAdds")
    public String toAdd(){
        return "ad_saadd";
    }

    @RequestMapping(value = "/adadds",method = RequestMethod.POST)
    public String salesadd(sales sales,Model model ) {//,String Id,
        salesService.add(sales);
        List<sales> saless = salesService.salesList();
        model.addAttribute("pages", saless);
        return "ad_salesman";
    }

    @RequestMapping("toadUpdates")
    public String toUpdate(){
        return "ad_sarev";
    }

    @RequestMapping(value = "/adupdates",method = RequestMethod.POST)
    public String salesupdate(sales sales,Model model ) {//,String Id,
        salesService.update(sales);
        List<sales> saless = salesService.salesList();
        model.addAttribute("pages", saless);
        return "ad_salesman";
    }

}
