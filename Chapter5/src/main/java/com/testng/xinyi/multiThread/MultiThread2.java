package com.testng.xinyi.multiThread;

import org.testng.annotations.Test;

public class MultiThread2 {
    @Test
    public void test01(){
        //打印当前线程id
        System.out.printf("test01---Thread id: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test02(){
        //打印当前线程id
        System.out.printf("test02---Thread id: %s%n", Thread.currentThread().getId());
    }
    @Test
    public void test03(){
        //打印当前线程id
        System.out.printf("test03---Thread id: %s%n", Thread.currentThread().getId());
    }
}
