package com.example.springbootdemo.service;
import com.example.springbootdemo.bean.sales;

import java.util.List;

public interface salesService {
    sales logIn(String sname,String spassword);

    List<sales> salesList();

    sales select(String sname);
    sales selectself(String sid);

    sales delete(String sid);

    void add(sales sales);

    void update(sales sales);
}
