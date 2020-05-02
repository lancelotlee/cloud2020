package com.sorlin.springcloud.service.impl;

import com.sorlin.springcloud.dao.PaymentDao;
import com.sorlin.springcloud.entities.Payment;
import com.sorlin.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 李松岭
 * @date 2020-04-22 21:44
 **/
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }

}
