package com.rainotes.erp.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.stereotype.Controller;

@Controller
public class EmpAction extends ActionSupport {

    public String list(){
        return "list";
    }

    public String input(){
        return "input";
    }

}
