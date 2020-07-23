package com.sorlin.springcloud.alibaba.service;


import com.sorlin.springcloud.alibaba.domain.Order;

/**
 * @author sorlin
 * @date 2020-05-09 16:22
 **/
public interface OrderService {
    void create(Order order);
}
