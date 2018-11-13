package com.hjq.springboot.springbootsimpleexample.controller;

import com.hjq.springboot.springbootsimpleexample.model.OrderInfo;
import com.hjq.springboot.springbootsimpleexample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {


    @Autowired
    private OrderService orderService;


    @RequestMapping(value = "/test/order")
    public String testOrder(){
        List<OrderInfo> list = orderService.listOrders();

        System.out.println(list.size());

        return "ok";
    }


    @RequestMapping(value = "/test/test01")
    public String test(){
        String str = "hello Springboot";
        return  str;
    }

}
