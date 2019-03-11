package com.springboot.hui.TestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHelloController {

    @RequestMapping(value = "/testHello")
    public String testHello(){

        return "hello springboot";
    }
}
