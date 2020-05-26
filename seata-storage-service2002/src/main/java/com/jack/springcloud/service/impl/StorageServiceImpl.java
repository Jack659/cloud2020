package com.jack.springcloud.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.jack.springcloud.dao.StorageMapper;
import com.jack.springcloud.domain.Storage;
import com.jack.springcloud.service.StorageService;

/**
 * @Author: Jack
 * @Date: 2020/5/26 23:25
 */
@Service
@Slf4j
public class StorageServiceImpl extends ServiceImpl<StorageMapper, Storage> implements StorageService {

    // 扣减库存
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("------->storage-service中扣减库存开始");
        this.baseMapper.decrease(productId, count);
        log.info("------->storage-service中扣减库存结束");
    }

}
