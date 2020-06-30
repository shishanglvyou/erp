package com.rainotes.erp.service.impl;

import com.rainotes.erp.dao.EmpMapper;
import com.rainotes.erp.domain.Emp;
import com.rainotes.erp.domain.EmpExample;
import com.rainotes.erp.query.EmpQuery;
import com.rainotes.erp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public void saveEmp(Emp emp) {
        empMapper.insert(emp);
    }

    @Override
    public void updateEmp(Emp emp) {
        empMapper.updateByPrimaryKeySelective(emp);
    }

    @Override
    public void deleteEmp(Integer empId) {
        empMapper.deleteByPrimaryKey(empId);
    }

    @Override
    public Emp selectEmp(Integer empId) {
        return empMapper.selectByPrimaryKey(empId);
    }

    @Override
    public List<Emp> selectEmpByCondition(EmpExample example,EmpQuery equery) {
        return empMapper.selectByExample(example);
    }

    @Override
    public List<Emp> selectEmpByExample() {
        return empMapper.selectByExample(null);
    }
}
