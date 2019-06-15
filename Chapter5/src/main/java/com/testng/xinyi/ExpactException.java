package com.testng.xinyi;

import org.testng.annotations.Test;

/**
 * 我们期望结果为某个异常时， expectedException 属性
 * 比如：我们传入某些不合法的参数，程序抛出异常
 */
public class ExpactException {
    @Test (expectedExceptions = RuntimeException.class)  //期待出现运行时异常
    public void runExceptionFailed(){
        System.out.println("这是一个失败的异常测试，结果与期待的异常不一致");
    }
    @Test (expectedExceptions = RuntimeException.class)  //期待出现运行时异常
    public void runExceptionTrue(){
        System.out.println("这是一个成功的异常测试，运行抛出异常runTimeException");
        throw new RuntimeException();
    }

}
