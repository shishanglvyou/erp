package com.rainotes.erp.service.impl;

import com.rainotes.erp.dao.DepMapper;
import com.rainotes.erp.domain.Dep;
import com.rainotes.erp.domain.DepExample;
import com.rainotes.erp.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepServiceImpl implements DepService {

    @Autowired
    private DepMapper depMapper;

    @Override
    public void saveDep(Dep dep) {
        depMapper.insert(dep);
    }

    @Override
    public void updateDep(Dep dep) {
        depMapper.updateByPrimaryKeySelective(dep);
    }

    @Override
    public void deleteDep(Integer depId) {
        depMapper.deleteByPrimaryKey(depId);
    }

    @Override
    public Dep selectDep(Integer depId) {
        return depMapper.selectByPrimaryKey(depId);
    }

    @Override
    public List<Dep> selectDepByCondition(DepExample example) {
        return depMapper.selectByExample(example);
    }

    @Override
    public List<Dep> selectDepByExample() {
        return depMapper.selectByExample(null);
    }
}
