package com.hjq.springboot.springbootsimpleexample.service;

import com.hjq.springboot.springbootsimpleexample.model.OrderInfo;

import java.util.List;

public interface OrderService {

    List<OrderInfo> listOrders();
}
