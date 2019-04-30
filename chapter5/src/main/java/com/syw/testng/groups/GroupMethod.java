package com.syw.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author shiyanwu
 */
public class GroupMethod {

    @Test(groups = "server")
    public void test1() {
        System.out.println("这是服务端组的测试方法1111");
    }

    @Test(groups = "server")
    public void test2() {
        System.out.println("这是服务端组的测试方法2222");
    }

    @Test(groups = "client")
    public void test3() {
        System.out.println("这是客户端组的测试方法3333");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("这是客户端组的测试方法4444");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnSever() {
        System.out.println("这是服务端组运行之前执行的方法");
    }

    @AfterGroups("server")
    public void afterGroupsOnSever() {
        System.out.println("这是服务端组运行之后执行的方法！！！！");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient() {
        System.out.println("这是客户端组运行之前执行的方法");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient() {
        System.out.println("这是客户端组运行之后执行的方法！！！！");
    }

}
