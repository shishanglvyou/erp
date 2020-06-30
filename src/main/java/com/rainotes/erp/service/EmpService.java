package com.rainotes.erp.service;

import com.rainotes.erp.domain.Emp;
import com.rainotes.erp.domain.EmpExample;
import com.rainotes.erp.query.EmpQuery;

import java.util.List;

public interface EmpService {
    void saveEmp(Emp emp);

    void updateEmp(Emp emp);

    void deleteEmp(Integer empId);

    Emp selectEmp(Integer empId);

    List<Emp> selectEmpByCondition(EmpExample example, EmpQuery equery);

    List<Emp> selectEmpByExample();
}
