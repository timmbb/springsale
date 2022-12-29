package com.example.springbootdemo.servicelmpl;
import com.example.springbootdemo.bean.orders;
import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.mapper.ordersmapper;
import com.example.springbootdemo.service.ordersService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

@Service
public class ordersServiceimpl implements ordersService{
    @Resource
    private ordersmapper ordersmapper;

    @Override
    public List<orders> ordersList(){return ordersmapper.ordersList();}

    public List<orders> selectall(String sname) {
        return ordersmapper.selectall(sname);
    }
    public orders selectself(String oid){
        return ordersmapper.selectself(oid);
    }

    public orders delete(String oid){
        return ordersmapper.delete(oid);
    }

    public void add(orders orders){
        ordersmapper.add(orders);
    }

    public void update(orders orders){
        ordersmapper.update(orders);
    }
}
