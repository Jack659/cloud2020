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
 * @Date: 2020/5/26 23:23
 *
 */   
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName(value = "t_account")
public class Account implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 用户id
     */
    @TableField(value = "user_id")
    private Long userId;

    /**
     * 总额度
     */
    @TableField(value = "total")
    private Long total;

    /**
     * 已用余额
     */
    @TableField(value = "used")
    private Long used;

    /**
     * 剩余可用额度
     */
    @TableField(value = "residue")
    private Long residue;

    private static final long serialVersionUID = 1L;
}