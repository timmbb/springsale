package com.example.springbootdemo;

import com.example.springbootdemo.bean.sales;
import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.bean.orders;
import com.example.springbootdemo.service.productService;
import com.example.springbootdemo.service.usService;
import com.example.springbootdemo.service.ordersService;
import com.example.springbootdemo.service.salesService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootdemoApplicationTests {

    @Resource
    usService userService;
    @Resource
    productService proService;
    @Resource
    ordersService orService;
    @Resource
    salesService salesService;
    @Test
    void contextLoads() {
//        List<user> users1=userService.userList();
//        user u1=users1.get(10);
//        u1.setId("11");
      /*  u1.setUserName("aaaaaa");
        u1.setPassWord("tt01");
        u1.setSex("male");
        u1.setAddress("Liyue");
        u1.setEmail("e01");
        u1.setPhone("p01");
        u1.setVX("v01");
        u1.setQQ("q01");
        userService.update(u1);*/
//        List<orders> orders=orService.ordersList();
//        for (int i=0;i<orders.size();i++)
//            System.out.println(orders.get(i).getOid());
        user userBean = userService.logIn("Keqing","keqing06");
        sales sales=salesService.selectself("01");
        System.out.println(sales.getsname());
    }

}
