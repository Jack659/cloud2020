package com.jack.springcloud.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.jack.springcloud.domain.Storage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author: Jack
 * @Date: 2020/5/26 23:25
 */
@Mapper
public interface StorageMapper extends BaseMapper<Storage> {

    //扣减库存信息
    void decrease(@Param("productId") Long productId,
                  @Param("count") Integer count);

}