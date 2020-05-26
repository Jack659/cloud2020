package com.jack.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: Jack
 * @Date: 2020/5/26 22:29
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SeataStorageMainApp2002 {
    public static void main(String[] args){
        SpringApplication.run(SeataStorageMainApp2002.class, args);
    }
}
