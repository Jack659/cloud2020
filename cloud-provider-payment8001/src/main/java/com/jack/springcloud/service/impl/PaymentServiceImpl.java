package com.jack.springcloud.service.impl;

import com.jack.springcloud.entities.Payment;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jack.springcloud.dao.PaymentDao;
import com.jack.springcloud.service.PaymentService;

/**
 * @Author: Jack
 * @Date: 2020/5/9 11:17
 */
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentDao, Payment> implements PaymentService {

}

