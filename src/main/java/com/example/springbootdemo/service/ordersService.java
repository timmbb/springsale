package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.orders;

import java.util.List;

public interface ordersService {
    List<orders> ordersList();

    List<orders> selectall(String sname);
    orders selectself(String oid);

    orders delete(String oid);

    void add(orders orders);

    void update(orders orders);
}
