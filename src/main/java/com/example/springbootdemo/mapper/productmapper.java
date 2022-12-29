package com.example.springbootdemo.mapper;

import com.example.springbootdemo.bean.product;

import java.util.List;
public interface productmapper {
    List<product> productList();

    product select(String pid);

    product delete(String pid);

    Integer add(product products);

    Integer update(product products);
}