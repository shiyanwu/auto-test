package com.syw.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupsOnClass3 {

    public void teach1() {
        System.out.println("GroupsOnClass3中的teach1运行");
    }

    public void teach2() {
        System.out.println("GroupsOnClass3中的teach2运行");
    }
}
