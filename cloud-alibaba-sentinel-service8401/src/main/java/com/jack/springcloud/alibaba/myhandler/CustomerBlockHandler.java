package com.jack.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.jack.springcloud.entities.CommonResult;

/**
 * @Author: Jack
 * @Date: 2020/5/26 11:42
 */

public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....gloabl handleException----1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return new CommonResult(4444, "自定义限流处理信息....gloabl handleException----2");
    }
}
