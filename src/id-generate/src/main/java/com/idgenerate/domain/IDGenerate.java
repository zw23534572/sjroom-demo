package com.idgenerate.domain;

import lombok.Data;

/**
 * @author manson.zhou on 2018/2/3.
 */
@Data
public class IDGenerate {
    /**
     * 自增ID
     */
    private Long id;
    /**
     * 服务器IP
     */
    private String stub;
    /**
     * 服务器重启时更新此ID
     */
    private Long currentMaxId;
}
