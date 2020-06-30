package com.rainotes.erp.dao;

import com.rainotes.erp.domain.RelationEmpRole;
import com.rainotes.erp.domain.RelationEmpRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationEmpRoleMapper {
    long countByExample(RelationEmpRoleExample example);

    int deleteByExample(RelationEmpRoleExample example);

    int deleteByPrimaryKey(Integer relationId);

    int insert(RelationEmpRole record);

    int insertSelective(RelationEmpRole record);

    List<RelationEmpRole> selectByExample(RelationEmpRoleExample example);

    RelationEmpRole selectByPrimaryKey(Integer relationId);

    int updateByExampleSelective(@Param("record") RelationEmpRole record, @Param("example") RelationEmpRoleExample example);

    int updateByExample(@Param("record") RelationEmpRole record, @Param("example") RelationEmpRoleExample example);

    int updateByPrimaryKeySelective(RelationEmpRole record);

    int updateByPrimaryKey(RelationEmpRole record);
}