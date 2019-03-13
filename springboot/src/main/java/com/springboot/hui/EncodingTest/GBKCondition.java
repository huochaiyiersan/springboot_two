package com.springboot.hui.EncodingTest;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 判断入口程序编码是不是gbk是就返回true，不是就返回false
 */
public class GBKCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String encoding = System.getProperty("file.encoding");
        if (encoding != null) {
            return "gbk".equals(encoding.toLowerCase());
        }
        return false;
    }
}
