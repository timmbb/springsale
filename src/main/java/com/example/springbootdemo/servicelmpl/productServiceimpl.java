package com.example.springbootdemo.servicelmpl;

import com.example.springbootdemo.bean.product;
import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.mapper.productmapper;
import com.example.springbootdemo.service.productService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

@Service
public class productServiceimpl implements productService {
    @Resource
    private productmapper proMapper;

    @Override
    public List<product> productList(){
        return proMapper.productList();
    }

    @Override
    public product select(String pid) { return proMapper.select(pid);}

    public product delete(String pid){return proMapper.delete(pid);}

    @Override
    public void add(product products) {
        proMapper.add(products);
    }

    @Override
    public void update(product products) {
        proMapper.update(products);
    }
}