package com.rainotes.erp.query;

import com.rainotes.erp.domain.Emp;
import lombok.Data;

import java.util.Date;

@Data
public class EmpQuery extends Emp {

    private Date startBirth;

    private Date endBirth;
}
