package com.jack.springcloud.alibaba.controller;

import com.jack.springcloud.alibaba.service.PaymentService;
import com.jack.springcloud.entities.CommonResult;
import com.jack.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author: Jack
 * @Date: 2020/5/26 15:13
 */
@RestController
@Slf4j
public class OrderController {

    // OpenFeign
    @Resource
    private PaymentService paymentService;

    @GetMapping(value = "/consumer/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id) {
        return paymentService.paymentSQL(id);
    }

}
