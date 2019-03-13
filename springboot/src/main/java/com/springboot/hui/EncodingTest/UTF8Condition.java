package com.springboot.hui.EncodingTest;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * 判断入口程序编码是不是UTF-8是就返回true，不是就返回false
 */
public class UTF8Condition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        String encoding = System.getProperty("file.encoding");
        if (encoding != null) {
            return "utf-8".equals(encoding.toLowerCase());
        }
        return false;
    }

}
