package com.jack.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author: Jack
 * @Date: 2020/5/9 11:18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 单号
     */
    private String serial;

    private static final long serialVersionUID = 1L;
}