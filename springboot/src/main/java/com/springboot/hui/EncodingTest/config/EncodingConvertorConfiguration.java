package com.springboot.hui.EncodingTest.config;

import com.springboot.hui.EncodingTest.EncodingConvertor;
import com.springboot.hui.EncodingTest.GBKCondition;
import com.springboot.hui.EncodingTest.UTF8Condition;
import com.springboot.hui.EncodingTest.impl.GBKEncodingConvertor;
import com.springboot.hui.EncodingTest.impl.UTF8EncodingConvertor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 调用   UTF8Condition和GBKCondition俩个方法，全部调用完后才会执行new方法，
 */
@Configuration
public class EncodingConvertorConfiguration {


    @Bean
    @Conditional(UTF8Condition.class)
    public EncodingConvertor createUTF8EncodingConvertor() {
        return new UTF8EncodingConvertor();
    }

    @Bean
    @Conditional(GBKCondition.class)
    public EncodingConvertor createGBKEncodingConvertor() {
        return new GBKEncodingConvertor();
    }


}