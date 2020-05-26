package com.jack.springcloud.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jack.springcloud.dao.AccountMapper;
import com.jack.springcloud.domain.Account;
import com.jack.springcloud.service.AccountService;

/**
 * @Author: Jack
 * @Date: 2020/5/26 23:23
 */
@Service
@Slf4j
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements AccountService {

    /**
     * 扣减账户余额
     */
    @Override
    public void decrease(Long userId, BigDecimal money) {

        log.info("------->account-service中扣减账户余额开始");
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.baseMapper.decrease(userId, money);
        log.info("------->account-service中扣减账户余额结束");
    }

}
