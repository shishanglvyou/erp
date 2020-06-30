package com.rainotes.erp.dao;

import com.rainotes.erp.domain.StoreDetail;
import com.rainotes.erp.domain.StoreDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StoreDetailMapper {
    long countByExample(StoreDetailExample example);

    int deleteByExample(StoreDetailExample example);

    int deleteByPrimaryKey(Integer detailId);

    int insert(StoreDetail record);

    int insertSelective(StoreDetail record);

    List<StoreDetail> selectByExample(StoreDetailExample example);

    StoreDetail selectByPrimaryKey(Integer detailId);

    int updateByExampleSelective(@Param("record") StoreDetail record, @Param("example") StoreDetailExample example);

    int updateByExample(@Param("record") StoreDetail record, @Param("example") StoreDetailExample example);

    int updateByPrimaryKeySelective(StoreDetail record);

    int updateByPrimaryKey(StoreDetail record);
}