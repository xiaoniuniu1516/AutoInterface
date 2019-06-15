package com.testng.xinyi.groups;
import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass01 {
    public void stu01(){
        System.out.println("GroupsOnClass01 中的stu01111111 ");
    }
    public void stu02(){
        System.out.println("GroupsOnClass01 中的stu02222 ");
    }
}
