package com.testng.xinyi.multiThread;

import org.testng.annotations.Test;

//多线程测试,没有关联的用例可以使用多线程减少执行时间
public class multiThreadOnAnnotion {

    @Test(invocationCount = 10,threadPoolSize = 3)
    public void multiThread01(){
        System.out.println(1);
        System.out.printf("Thrad Id : %s%n",Thread.currentThread().getId());
    }

}
