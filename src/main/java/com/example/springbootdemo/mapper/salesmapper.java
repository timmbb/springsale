package com.example.springbootdemo.mapper;
import com.example.springbootdemo.bean.sales;
import com.example.springbootdemo.bean.user;

import java.util.List;

public interface salesmapper {
    sales getInfo(String sname, String spassword);

    List<sales> salesList();

    sales select(String sname);
    sales selectself(String sid);

    sales delete(String sid);

    Integer add(sales sales);

    Integer update(sales sales);
}
