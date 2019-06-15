package com.testng.xinyi.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TestParameter {

    @Test
    @Parameters({"name","age"})
    public void parameterTest(String name, int age ){
//        String name = "dddd";
        System.out.println("姓名："+ name + "\n年龄： " + age);
    }
}
