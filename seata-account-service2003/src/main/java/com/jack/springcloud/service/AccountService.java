package com.jack.springcloud.service;

import com.jack.springcloud.domain.Account;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @Author: Jack
 * @Date: 2020/5/26 23:23
 */
public interface AccountService extends IService<Account> {

    /**
     * 扣减账户余额
     */
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
