package com.idgenerate.dao;

import com.idgenerate.domain.IDGenerate;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface IDGenerateMapper {
    /**
     * 根据服务器IP，获取当前数据库主键ID
     *
     * @param stub
     * @return
     */
    IDGenerate getInfoByStub(String stub);

    /**
     * 替换当前服务器IP，对应的数据库主键ID
     *
     * @param stub
     * @return
     */
    void replaceGenerateId(String stub);

    /**
     * 更新最大的ID值
     *
     * @param stub
     * @param currentMaxId 当前最大的ID
     * @return
     */
    Long replaceCurrentMaxIdByStub(@Param("stub") String stub, @Param("currentMaxId") Long currentMaxId);
}
