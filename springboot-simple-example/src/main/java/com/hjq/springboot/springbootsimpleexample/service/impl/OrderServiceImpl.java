package com.hjq.springboot.springbootsimpleexample.service.impl;

import com.hjq.springboot.springbootsimpleexample.dao.OrderMapper;
import com.hjq.springboot.springbootsimpleexample.model.OrderInfo;
import com.hjq.springboot.springbootsimpleexample.model.OrderItem;
import com.hjq.springboot.springbootsimpleexample.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("orderService")
@Transactional
public class OrderServiceImpl implements OrderService {


    @Autowired
    private OrderMapper orderMapper;

    @Transactional(readOnly = true)
    public List<OrderInfo> listOrders() {

        List<OrderInfo> list = orderMapper.listOrder();

        for (OrderInfo ol:list){
            List<OrderItem> itemList = ol.getItemList();
            System.out.println(itemList.size());
            System.out.println(ol.getId());
        }
        return list;
    }
}
