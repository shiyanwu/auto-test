package com.syw.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * @author shiyanwu
 */
public class BasicAnnotation {

    /**
     * `@Test` 这个是最基本的注解，用来把方法标记为测试的一部份
     */
    @Test
    public void testCase1() {
        System.out.println("@Test--这是测试用例1");
    }

    @Test
    public void testCase2() {
        System.out.println("@Test--这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("@BeforeMethod--这是在测试方法之前运行的");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("@AfterMethod--这是在测试方法之后运行的");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("@BeforeClass--这是在类运行之前运行的");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("@AfterClass--这是在类运行之前运行的");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("@AfterSuite");
    }
}
