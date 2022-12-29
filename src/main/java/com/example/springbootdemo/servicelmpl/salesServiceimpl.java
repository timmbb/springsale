package com.example.springbootdemo.servicelmpl;
import com.example.springbootdemo.bean.sales;
import com.example.springbootdemo.bean.user;
import com.example.springbootdemo.mapper.salesmapper;
import com.example.springbootdemo.service.salesService;
import org.springframework.stereotype.Service;
import java.util.List;
import javax.annotation.Resource;

@Service
public class salesServiceimpl implements salesService{
    @Resource
    private salesmapper salesmapper;

    @Override
    public sales logIn(String sname, String spassword) {
        return salesmapper.getInfo(sname, spassword);
    }

    public List<sales> salesList(){
        return salesmapper.salesList();
    }

    public sales select(String sname)
    {
        return salesmapper.select(sname);
    }
    public sales selectself(String sid)
    {
        return salesmapper.selectself(sid);
    }

    public sales delete(String sid){
        return salesmapper.delete(sid);
    }

    public void add(sales sales){
        salesmapper.add(sales);
    }

    public void update(sales sales){
        salesmapper.update(sales);
    }
}
