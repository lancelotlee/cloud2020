package com.sorlin.springcloud.alibaba.controller;

import com.sorlin.springcloud.alibaba.domain.CommonResult;
import com.sorlin.springcloud.alibaba.domain.Order;
import com.sorlin.springcloud.alibaba.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 李松岭
 * @date 2020-05-09 16:46
 **/
@RestController
public class OrderController{
    @Resource
    private OrderService orderService;


    @GetMapping("/order/create")
    public CommonResult create(Order order)
    {
        orderService.create(order);
        return new CommonResult(200,"订单创建成功");
    }
}

