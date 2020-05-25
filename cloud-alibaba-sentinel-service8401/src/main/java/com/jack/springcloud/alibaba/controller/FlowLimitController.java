package com.jack.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Jack
 * @Date: 2020/5/25 10:41
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        // 暂停毫秒
//        try {
////            TimeUnit.MILLISECONDS.sleep(800);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
        return "------testA";
    }

    @GetMapping("/testB")
    public String testB() {
        log.info(Thread.currentThread().getName() + "   ...testB");
        return "------testB";
    }


    @GetMapping("/testD")
    public String testD() {
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        log.info("testD 测试RT");

        int a = 10 / 0;
        log.info("testD 异常比例");
        return "------testD";
    }

    @GetMapping("/testE")
    public String testE() {
        log.info("testE 测试异常数");
        int age = 10 / 0;
        return "------testE 测试异常数";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
                             @RequestParam(value = "p2", required = false) String p2) {
//        int age = 10 / 0;
        return "------testHotKey";
    }

    //兜底方法
    public String deal_testHotKey(String p1, String p2, BlockException exception) {
        log.info("params:{},{}  exception:{}", p1, p2, exception.getMessage());
        return "------deal_testHotKey,o(╥﹏╥)o ";
    }


}
