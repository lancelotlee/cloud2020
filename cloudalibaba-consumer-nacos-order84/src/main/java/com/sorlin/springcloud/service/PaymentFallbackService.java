package com.sorlin.springcloud.service;

import com.sorlin.springcloud.entities.CommonResult;
import com.sorlin.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author sorlin
 * @date 2020-05-07 16:20
 **/
@Component
public class PaymentFallbackService implements PaymentService{
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444,"服务降级返回,---PaymentFallbackService",new Payment(id,"errorSerial"));
    }
}
