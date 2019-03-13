package com.springboot.hui.EncodingTest.impl;

import com.springboot.hui.EncodingTest.EncodingConvertor;

/**
 * 如果入口程序编码是utf-8，就执行到这里
 */
public class UTF8EncodingConvertor implements EncodingConvertor {
    public UTF8EncodingConvertor(){

        System.out.println("this is utf-8");
    }
}
