package com.idgenerate.service;

/**
 * <B>中文类名： id生成器 Service</B><BR>
 * <B>概要说明：</B><BR>
 *
 * @author 贸易研发部：Zhouwei
 * @since 2018年02月03日
 */
public interface IDGenerateService {
    /**
     * 获取ID值
     * 默认为 127.0.0.1
     */
    Long get();

    /**
     * 获取ID值
     *
     * @param ip 当前服务器IP
     */
    Long get(String ip);

    /**
     * 更新当前最大的IP
     * @param ip
     */
    void replaceCurrentMaxId(String ip);

}
