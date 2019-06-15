package com.testng.xinyi;

import org.testng.annotations.Test;

import static java.lang.Thread.currentThread;

public class Test01 {
    @Test
    public void ingore01(){
        System.out.println("ingore 01 被执行  thread id =", currentThread().getId());
    }
    @Test (enabled = false) // enable = fales ,该用例被忽略，不被执行
    public void ingore02(){
        System.out.println("ingore 02 被执行");
    }
}
