package com.jack.springcloud.service;

import com.jack.springcloud.domain.Storage;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @Author: Jack
 * @Date: 2020/5/26 23:25
 */
public interface StorageService extends IService<Storage> {

    // 扣减库存
    void decrease(Long productId, Integer count);

}
