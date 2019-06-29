package com.testng.xinyi.suite;

import org.testng.annotations.*;

public class testCase {

    //testng中最基本的注解，用来把方法标记为测试方法的一部分

    @Test
    public void testCase01(){
        System.out.println("这是测试用例01");
    }
    @Test
    public void testCase02(){
        System.out.println("这是测试用例02");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod是测试方法后运行的");
    }
    @BeforeMethod
    public void beforeMethod01(){
        System.out.println("BeforeMethod是测试方法之前运行的");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("---BeforeClass测试套件");
    }
    @AfterSuite
    public void afterClass(){
        System.out.println("---AfterClass测试套件");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("------BeforeSuite测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("------AfterSuite测试套件");
    }

}
