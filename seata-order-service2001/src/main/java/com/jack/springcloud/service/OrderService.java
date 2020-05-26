package com.jack.springcloud.service;

import com.jack.springcloud.domain.Order;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author: Jack
 * @Date: 2020/5/26 22:41
 */
public interface OrderService extends IService<Order> {

    void create(Order order);

}
