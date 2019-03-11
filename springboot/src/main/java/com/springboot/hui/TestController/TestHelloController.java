package com.springboot.hui.TestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

@RestController
public class TestHelloController {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestHelloController.class);

    @RequestMapping(value = "/testHello")
    public String testHello(){
        LOGGER.info("this is test info",this.getClass());
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
