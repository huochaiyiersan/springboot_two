package com.springboot.hui.TestController;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHelloController {

   // private static final Logger LOGGER = LoggerFactory.getLogger(TestHelloController.class);
   static Logger logger =  LogManager.getLogger(TestHelloController.class.getName());


    @RequestMapping(value = "/testHello")
    public String testHello(){
       // LOGGER.info("this is test info",this.getClass());
        logger.info("woshi hahahahah ",this.getClass());
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
