package com.jack.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Jack
 * @Date: 2020/5/11 17:08
 */
@RestController
public class OrderConsulController {

    public static final String INVOME_URL = "http://consul-provider-payment";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payment() {
        String result = restTemplate.getForObject(INVOME_URL + "/payment/consul", String.class);
        return result;
    }


}
