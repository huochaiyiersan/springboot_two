package com.springboot.hui.TestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHelloController {

    @RequestMapping(value = "/testHello")
    public String testHello(){

        return "hello springboot";
    }

    @RequestMapping(value = "/testhhh")
    public String testload(){
        return "etstload";
    }


    @RequestMapping(value = "/testkui")
    public String testloadgg(){
        return "etstload";
    }

}
