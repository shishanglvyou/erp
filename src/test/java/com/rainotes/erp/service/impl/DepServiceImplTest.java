package com.rainotes.erp.service.impl;

import com.rainotes.erp.domain.Dep;
import com.rainotes.erp.domain.DepExample;
import com.rainotes.erp.service.DepService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
class DepServiceImplTest {

    @Autowired
    private DepService depService;

    @Test
    void saveDep() {
        Dep dep = new Dep();
        dep.setName("技术部");
        dep.setTel("010-88888888");
        depService.saveDep(dep);
    }

    @Test
    void updateDep() {
    }

    @Test
    void deleteDep() {
    }

    @Test
    void selectDep() {
    }

    @Test
    void selectDepByCondition() {
        DepExample depExample = new DepExample();
        DepExample.Criteria criteria = depExample.createCriteria();
        criteria.andNameLike("%门%");
        List<Dep> deps = depService.selectDepByCondition(depExample);
        for (Dep dep : deps) {
            System.out.println(dep);
        }
    }

    @Test
    void selectDepByExample() {
    }
}