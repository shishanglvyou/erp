package com.rainotes.erp.dao;

import com.rainotes.erp.domain.StoreLog;
import com.rainotes.erp.domain.StoreLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreLogMapper {
    long countByExample(StoreLogExample example);

    int deleteByExample(StoreLogExample example);

    int deleteByPrimaryKey(Integer logId);

    int insert(StoreLog record);

    int insertSelective(StoreLog record);

    List<StoreLog> selectByExample(StoreLogExample example);

    StoreLog selectByPrimaryKey(Integer logId);

    int updateByExampleSelective(@Param("record") StoreLog record, @Param("example") StoreLogExample example);

    int updateByExample(@Param("record") StoreLog record, @Param("example") StoreLogExample example);

    int updateByPrimaryKeySelective(StoreLog record);

    int updateByPrimaryKey(StoreLog record);
}