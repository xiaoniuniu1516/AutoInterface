package com.testng.xinyi.parameter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.lang.reflect.Method;

public class testDataProvider {
    @Test(dataProvider = "data")
    public void parameterTest(String name, int age ){

        System.out.println("姓名："+ name + "; 年龄： " + age);
    }
    //简单的直接将参数传递给方法
@DataProvider(name = "data")
    public Object[][] providerData (){
        Object arr[][] = new Object[][]{
                {"张三",10},
                {"李四",20},
                {"王五",30}
        };
        return arr;

    }

    //假如多个测试用例，都有DataProvider提供参数，
    // 那么不同测试方法用不同的参数，可以用以下方式实现传递
    @Test(dataProvider = "data1")
    public void testMethod01(String name , int age){
        System.out.println("用例00000111111  姓名："+ name + "; 年龄： " + age);
            }
    @Test(dataProvider = "data1")
    public void testMethod02(String name ,int age){
        System.out.println("用例0002222   姓名："+ name + "; 年龄： " + age);
    }
    @DataProvider(name = "data1")
    public Object[][] dataForMethods(Method method){
        Object arr[][] = null;
        if(method.getName().equals("testMethod01")){
            arr= new Object[][]{
                {"用例01—11",10},
                {"用例01—22",20}
            };
        }else if(method.getName().equals("testMethod02")){
            arr =new Object[][] {
                {"用例02—11",10},
                {"用例02—22",20}
            };
        };
        return arr;
    }

}
