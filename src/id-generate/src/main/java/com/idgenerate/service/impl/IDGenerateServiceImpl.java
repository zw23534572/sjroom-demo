package com.idgenerate.service.impl;

import com.idgenerate.service.IDGenerateService;
import com.idgenerate.common.IDGenerateHelper;
import com.idgenerate.dao.IDGenerateMapper;
import com.idgenerate.domain.IDGenerate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <B>中文类名： id生成器 Service</B><BR>
 * <B>概要说明：</B><BR>
 *
 * @author 贸易研发部：Zhouwei
 * @since 2018年02月03日
 */
@Service
public class IDGenerateServiceImpl implements IDGenerateService {
    @Autowired
    IDGenerateMapper idGenerateMapper;

    @Override
    public Long get() {
        return get("127.0.0.1");
    }

    @Override
    public Long get(String ip) {
        Long id = IDGenerateHelper.newInstance().get();
        if (id != null) {
            return id;
        }
        return reset(ip);
    }

    /**
     * 并发场景时，先锁住请求，再去取IP段返回。
     * @param stub 本地服务器IP
     * @return
     */
    public synchronized Long reset(String stub) {
        //服务器实例
        IDGenerate idGenerate = idGenerateMapper.getInfoByStub(stub);
        if (idGenerate != null && idGenerate.getCurrentMaxId() != null && idGenerate.getCurrentMaxId().intValue() > 0) {
            //数据如果有记录该服务器IP最大的ID值，取该值重新开始
            IDGenerateHelper.newInstance().init(idGenerate.getId(), idGenerate.getCurrentMaxId());
            idGenerateMapper.replaceCurrentMaxIdByStub(stub, null);
        }

        // 重新初始化值
        if (IDGenerateHelper.newInstance().isInitGenerate()) {
            idGenerateMapper.replaceGenerateId(stub);
            IDGenerate dbIdGenerate = idGenerateMapper.getInfoByStub(stub);
            IDGenerateHelper.newInstance().init(dbIdGenerate.getId());
        }

        return IDGenerateHelper.newInstance().getcurrentIdIndex();
    }

    @Override
    public void replaceCurrentMaxId(String ip) {
        Long currentIdIndex = IDGenerateHelper.newInstance().getcurrentIdIndex();
        idGenerateMapper.replaceCurrentMaxIdByStub(ip, currentIdIndex);
    }
}
