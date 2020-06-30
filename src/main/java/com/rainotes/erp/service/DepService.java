package com.rainotes.erp.service;

import com.rainotes.erp.domain.Dep;
import com.rainotes.erp.domain.DepExample;

import java.util.List;

public interface DepService {
    void saveDep(Dep dep);

    void updateDep(Dep dep);

    void deleteDep(Integer depId);

    Dep selectDep(Integer depId);

    List<Dep> selectDepByCondition(DepExample example);

    List<Dep> selectDepByExample();
}
