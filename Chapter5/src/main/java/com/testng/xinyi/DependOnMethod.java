package com.testng.xinyi;

import org.testng.annotations.Test;

//被依赖的方法如果执行失败，则依赖方被忽略，不被执行
public class DependOnMethod {
    @Test
    public void test01(){
        System.out.println("测试前提，被测试02依赖");
        throw new RuntimeException();
    }
    @Test (dependsOnMethods = {"test01"})
    public void test02(){
        System.out.println("测试方法02， 依赖测试方法01");

    }

}
