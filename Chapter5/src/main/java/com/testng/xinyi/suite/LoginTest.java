package com.testng.xinyi.suite;

import org.testng.annotations.*;

/**
 * 测试用例共有的一些条件和基本预备都写在suiteConfig中
 * LoginTest中写具体的测试用例
 */
public class LoginTest {
    @Test
    public void loginTaoBao(){
        System.out.println("----淘宝登陆成功了！！");
    }


}
