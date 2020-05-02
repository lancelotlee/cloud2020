package com.sorlin.springcloud.controller;

import com.sorlin.springcloud.entities.CommonResult;
import com.sorlin.springcloud.entities.Payment;
import com.sorlin.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author 李松岭
 * @date 2020-04-22 21:50
 **/
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int resulet = paymentService.create(payment);
        log.info("***********插入结果：" + resulet);
        if (resulet > 0) {
            return new CommonResult(200, "插入数据库成功，serverPort:" + serverPort, resulet);
        } else {
            return new CommonResult(444, "插入数据库失败，serverPort:" + serverPort);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("***********查询结果：" + payment + "\t" + "哈哈哈哈哈哈哈");
        if (payment != null) {
            return new CommonResult(200, "查询成功，serverPort:" + serverPort, payment);
        } else {
            return new CommonResult(444, "没有找到对应记录：" + id + "，serverPort:" + serverPort);
        }
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB(){
        return serverPort;
    }
}
