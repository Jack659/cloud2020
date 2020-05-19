package com.jack.springcloud.controller;

import com.jack.springcloud.entities.CommonResult;
import com.jack.springcloud.entities.Payment;
import com.jack.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author: Jack
 * @Date: 2020/5/9 11:20
 */
@Slf4j
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private DiscoveryClient discoveryClient;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {

        boolean result = paymentService.save(payment);
        log.info("插入结果：" + result);
        if (result) {
            return new CommonResult(200, "插入数据库成功,端口号：" + serverPort, result);
        } else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {

        Payment payment = paymentService.getById(id);
        log.info("查询结果：" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,端口号：" + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录，查询ID:" + id, null);
        }
    }

    @GetMapping("/payment/discovery")
    public Object discovery() {
        List<String> service = discoveryClient.getServices();
        service.forEach(element -> {
            log.info("**********element:{}", element);
        });

        List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");

        instances.forEach(instance -> {
            log.info("{} {} {} {}", instance.getInstanceId(), instance.getHost(), instance.getPort(), instance.getUri());
        });

        return this.discoveryClient;
    }

    @GetMapping(value = "/payment/lb")
    public String getPaymentLB() {
        return serverPort;
    }

    @GetMapping("/payment/feign/timeout")
    public String paymentFeignTimeout() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return serverPort;
    }

    @GetMapping("/payment/zipkin")
    public String paymentZipkin() {
        return "hi ,i'am payment-zipkin server fall back，welcome！O(∩_∩)O哈哈~";
    }


}
