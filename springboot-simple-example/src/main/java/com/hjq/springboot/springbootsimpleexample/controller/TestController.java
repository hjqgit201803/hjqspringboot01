package com.hjq.springboot.springbootsimpleexample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {




    @RequestMapping(value = "/test/test01")
    public String test(){
        String str = "hello Springboot";
        return  str;
    }

}
