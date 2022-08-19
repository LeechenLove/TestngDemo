package learn.testng;

import org.testng.annotations.*;

/**
 * @Author: Lulu
 * @Description: TODO
 * @DateTime: 2022/8/16 21:39
 **/
public class Testng {

    @Test(groups = { "demo" })
    public void testCase1() {
        System.out.println("This is the A Normal Test Case");
    }

    @Test(groups = { "demo1" })
    public void testCase2() {
        System.out.println("This is the B Normal Test Case");
    }

    @BeforeMethod()
    public void beforeMethod() {
        System.out.println("This will execute before every Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("This will execute after every Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("This will execute after the Class");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("This will execute before the Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("This will execute after the Test");
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("This will execute before the Test Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("This will execute after the Test Suite");
    }
}
