package com.sorlin.springcloud.service;

import com.sorlin.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author sorlin
 * @date 2020-04-22 21:43
 **/
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
