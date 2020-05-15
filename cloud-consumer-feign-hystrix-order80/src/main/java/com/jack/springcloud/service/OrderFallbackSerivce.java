package com.jack.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author: Jack
 * @Date: 2020/5/15 16:47
 */
@Component
public class OrderFallbackSerivce implements OrderHystrixService {

    @Override
    public String paymentInfo_OK(Integer id) {

        return "-----OrderFallbackSerivce fall back-paymentInfo_OK , (┬＿┬)";

    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {

        return "-----OrderFallbackSerivce fall back-paymentInfo_TimeOut , (┬＿┬)";

    }

}
