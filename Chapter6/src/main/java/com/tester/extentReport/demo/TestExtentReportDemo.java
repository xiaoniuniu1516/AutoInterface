package com.tester.extentReport.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestExtentReportDemo {
    @Test
    public void test01(){
        Assert.assertEquals(1,1);
    }

    @Test
    public void test02(){
        Assert.assertEquals(1,2);
    }

    @Test
    public void test03(){
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void log(){
       //调用一个写日志的函数Reporter.log
        Reporter.log("这是sunny自己写的日志");
        throw new RuntimeException("这是sunny自己写的运行时异常");
    }
}
