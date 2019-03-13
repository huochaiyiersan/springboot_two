package com.springboot.hui;

import com.springboot.hui.configbean.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HuiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext action = SpringApplication.run(HuiApplication.class, args);

        WebConfig webConfig = action.getBean(WebConfig.class);
        webConfig.show();
    }

}
