package com.testng.xinyi.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass03 {
    public void tea01(){
        System.out.println("GroupsOnClass03 中的-----teacher01111111 ");
    }
    public void tea02(){
        System.out.println("GroupsOnClass03 中的------teacher02222 ");
    }

}
