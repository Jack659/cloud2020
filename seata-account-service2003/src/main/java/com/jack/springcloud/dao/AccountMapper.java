package com.jack.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jack.springcloud.domain.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @Author: Jack
 * @Date: 2020/5/26 23:23
 */
@Mapper
public interface AccountMapper extends BaseMapper<Account> {
    /**
     * 扣减账户余额
     */
    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}