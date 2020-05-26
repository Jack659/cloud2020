package com.jack.springcloud.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: Jack
 * @Date: 2020/5/26 23:25
 *
 */   
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_storage")
public class Storage implements Serializable {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 产品id
     */
    @TableField(value = "product_id")
    private Long productId;

    /**
     * 总库存
     */
    @TableField(value = "total")
    private Integer total;

    /**
     * 已用库存
     */
    @TableField(value = "used")
    private Integer used;

    /**
     * 剩余库存
     */
    @TableField(value = "residue")
    private Integer residue;

    private static final long serialVersionUID = 1L;
}