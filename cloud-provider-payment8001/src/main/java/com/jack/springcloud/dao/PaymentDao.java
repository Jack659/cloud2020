package com.jack.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jack.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Jack
 * @Date: 2020/5/9 11:18
 */
@Mapper
public interface PaymentDao extends BaseMapper<Payment> {
}