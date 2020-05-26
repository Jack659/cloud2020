package com.jack.springcloud.alibaba.service;

import com.jack.springcloud.entities.CommonResult;
import com.jack.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author: Jack
 * @Date: 2020/5/26 15:10
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(4444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}
