package com.jack.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jack.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author: Jack
 * @Date: 2020/5/26 22:41
 *
 */   
@Mapper
public interface OrderMapper extends BaseMapper<Order> {


}