package com.testng.xinyi.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println();
        System.out.println("BeforeSuite 测试套件 运行啦");
    }
    @AfterSuite
    public void afterSuite(){

        System.out.println("AfterSuite  测试套件 运行啦");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("--BeforeTest 运行啦");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("--AfterTest  运行啦");
    }
}
