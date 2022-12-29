package com.example.springbootdemo.mapper;
import com.example.springbootdemo.bean.orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ordersmapper {
    List<orders> ordersList();

    List<orders> selectall(String sname);
    orders selectself(String oid);

    orders delete(String oid);

    Integer add(orders orders);

    Integer update(orders orders);
}
