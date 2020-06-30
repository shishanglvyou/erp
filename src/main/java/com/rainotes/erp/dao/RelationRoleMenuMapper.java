package com.rainotes.erp.dao;

import com.rainotes.erp.domain.RelationRoleMenu;
import com.rainotes.erp.domain.RelationRoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RelationRoleMenuMapper {
    long countByExample(RelationRoleMenuExample example);

    int deleteByExample(RelationRoleMenuExample example);

    int deleteByPrimaryKey(Integer relationId);

    int insert(RelationRoleMenu record);

    int insertSelective(RelationRoleMenu record);

    List<RelationRoleMenu> selectByExample(RelationRoleMenuExample example);

    RelationRoleMenu selectByPrimaryKey(Integer relationId);

    int updateByExampleSelective(@Param("record") RelationRoleMenu record, @Param("example") RelationRoleMenuExample example);

    int updateByExample(@Param("record") RelationRoleMenu record, @Param("example") RelationRoleMenuExample example);

    int updateByPrimaryKeySelective(RelationRoleMenu record);

    int updateByPrimaryKey(RelationRoleMenu record);
}