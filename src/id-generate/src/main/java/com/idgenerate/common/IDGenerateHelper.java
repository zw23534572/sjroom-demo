package com.idgenerate.common;

import java.util.concurrent.atomic.AtomicLong;

/**
 * <B>中文类名： id生成器</B><BR>
 * <B>概要说明：</B><BR>
 *
 * @author 贸易研发部：Zhouwei
 * @since 2018年02月03日
 */
public class IDGenerateHelper {
    /**
     * 自身的实例对象
     */
    private static class IDGenerateHelperHolder {
        private static IDGenerateHelper idGenerateHelper = new IDGenerateHelper();
    }

    /**
     * 扩大的倍数
     */
    private static final int MULTIPLE_COUNT = 10;
    /**
     * id值
     */
    private AtomicLong atomic = new AtomicLong();
    /**
     * id值的最大值
     */
    private Long currentMaxId = 0L;

    public static IDGenerateHelper newInstance() {
        return IDGenerateHelperHolder.idGenerateHelper;
    }

    /**
     * 获取ID值
     *
     * @return 返回ID值
     */
    public Long get() {
        if (isInitGenerate()) {
            return null;
        }
        //开始取ID段的值
        return incrementAndGet();
    }

    /**
     * 从数据库获取自增ID
     *
     * @param dbGeneratorId 获取数据库的自增ID
     * @return
     */
    public void init(Long dbGeneratorId) {
        atomic.set(dbGeneratorId * MULTIPLE_COUNT);
        this.currentMaxId = ((dbGeneratorId + 1) * MULTIPLE_COUNT) - 1;
    }

    public void init(Long dbGeneratorId, Long currentMaxId) {
        atomic.set(currentMaxId + 1);
        this.currentMaxId = ((dbGeneratorId + 1) * MULTIPLE_COUNT) - 1;
    }

    /**
     * 如果ID为0，或者为最大值时，需要初始化
     *
     * @return
     */
    public Boolean isInitGenerate() {
        return ((atomic.intValue() == 0) || atomic.intValue() == currentMaxId.intValue()) ? true : false;
    }

    private Long incrementAndGet() {
        return atomic.incrementAndGet();
    }

    /**
     * 获取当前ID索引值
     *
     * @return
     */
    public Long getcurrentIdIndex() {
        return atomic.get();
    }
}
