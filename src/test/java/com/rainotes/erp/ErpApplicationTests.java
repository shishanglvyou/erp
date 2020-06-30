package com.rainotes.erp;

import com.rainotes.erp.domain.Emp;
import com.rainotes.erp.domain.EmpExample;
import com.rainotes.erp.query.EmpQuery;
import com.rainotes.erp.service.EmpService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ErpApplicationTests {

    @Autowired
    private EmpService empService;

    @Test
    public void testSaveEmp() {
        Emp emp = new Emp();
        emp.setAddress("北京");
        emp.setBirthday(new Date());
        emp.setEmail("renliangge@126.com");
        emp.setGender(1);
        emp.setName("任亮");
        emp.setPassword("123");
        emp.setTel("9999");
        emp.setUsername("renliang");
        empService.saveEmp(emp);
    }

    @Test
    public void testUpdateEmp() {
        Emp emp = empService.selectEmp(9);
        emp.setUsername("rl");
        empService.updateEmp(emp);
    }

    @Test
    public void testDeleteEmp() {
        empService.deleteEmp(9);
    }

    @Test
    public void testQueryEmpByExample() {
        EmpQuery empQuery = new EmpQuery();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = null;
        Date endDate = null;
        //这里会有一个异常，所以要用try catch捕获异常
        try {
            startDate = sdf.parse("2016-01-06");
            endDate = sdf.parse("2016-04-01");
        } catch (Exception e) {
            e.printStackTrace();
        }
        empQuery.setStartBirth(startDate);
        empQuery.setEndBirth(endDate);
        EmpExample empExample = new EmpExample();
        EmpExample.Criteria criteria = empExample.createCriteria();
        criteria.andBirthdayGreaterThanOrEqualTo(empQuery.getStartBirth());
        criteria.andBirthdayLessThanOrEqualTo(empQuery.getEndBirth());
        List<Emp> list = empService.selectEmpByCondition(empExample, empQuery);
        System.out.println(list);
    }

    @Test
    public void testSelectAll() {
        List<Emp> list = empService.selectEmpByExample();
        System.out.println(list);
    }

}
