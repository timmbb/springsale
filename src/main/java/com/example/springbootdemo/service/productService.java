package com.example.springbootdemo.service;

import com.example.springbootdemo.bean.product;

import java.util.List;

public interface productService {
    List<product> productList();

    product select(String pid);

    product delete(String pid);

    void add(product products);

    void update(product products);
}