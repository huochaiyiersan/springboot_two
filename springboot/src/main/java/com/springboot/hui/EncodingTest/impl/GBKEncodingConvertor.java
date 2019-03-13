package com.springboot.hui.EncodingTest.impl;

import com.springboot.hui.EncodingTest.EncodingConvertor;

/**
 * 如果入口程序编码是gbk，就执行到这里
 */
public class GBKEncodingConvertor implements EncodingConvertor {

    public  GBKEncodingConvertor(){
         System.out.println("this is gbk");
     }

}
