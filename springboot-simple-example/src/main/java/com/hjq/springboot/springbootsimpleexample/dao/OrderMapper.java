package com.hjq.springboot.springbootsimpleexample.dao;

import com.hjq.springboot.springbootsimpleexample.model.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {

    int insertOrder(OrderInfo orderInfo);

    List<OrderInfo> listOrder();

}
