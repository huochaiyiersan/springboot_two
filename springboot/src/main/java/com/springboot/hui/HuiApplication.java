package com.springboot.hui;

import com.springboot.hui.EncodingTest.EncodingConvertor;
import com.springboot.hui.configbean.DataSourceProperties;
import com.springboot.hui.configbean.WebConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Map;

@SpringBootApplication
@EnableScheduling//spring自带定时器要加这个注解即可
public class HuiApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext action = SpringApplication.run(HuiApplication.class, args);

       // DataSourceProperties Config = action.getBean(DataSourceProperties.class);
       // Config.show();
        //获取入口程序的编码字符类型
       // System.out.println(System.getProperty("file.encoding"));

      //  Map<String, EncodingConvertor> map = action.getBeansOfType(EncodingConvertor.class);
       // System.out.println(map);
    }

}
