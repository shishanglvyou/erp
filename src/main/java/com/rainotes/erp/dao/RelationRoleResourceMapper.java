package com.rainotes.erp.dao;

import com.rainotes.erp.domain.RelationRoleResource;
import com.rainotes.erp.domain.RelationRoleResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationRoleResourceMapper {
    long countByExample(RelationRoleResourceExample example);

    int deleteByExample(RelationRoleResourceExample example);

    int deleteByPrimaryKey(Integer relationId);

    int insert(RelationRoleResource record);

    int insertSelective(RelationRoleResource record);

    List<RelationRoleResource> selectByExample(RelationRoleResourceExample example);

    RelationRoleResource selectByPrimaryKey(Integer relationId);

    int updateByExampleSelective(@Param("record") RelationRoleResource record, @Param("example") RelationRoleResourceExample example);

    int updateByExample(@Param("record") RelationRoleResource record, @Param("example") RelationRoleResourceExample example);

    int updateByPrimaryKeySelective(RelationRoleResource record);

    int updateByPrimaryKey(RelationRoleResource record);
}