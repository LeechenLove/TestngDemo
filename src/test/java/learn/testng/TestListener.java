package learn.testng;

import learn.listener.ListenersTestNG;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @Author: Lulu
 * @Description: 测试如何使用ITestListener
 * @DateTime: 2022/8/18 19:03
 **/
@Listeners(ListenersTestNG.class)
public class TestListener {
    // 测试通过的例子
    @Test
    public void closeBrowser() {
        System.out.println("close browser.");
    }

    // 测试不通过的例子
    @Test
    public void openBrowser() {
        int a = 1;
        int b = 2;
        Assert.assertEquals(a, b);
    }

    private int i = 1;
    @Test(successPercentage = 60, invocationCount = 4)
    public void AccountTest() {
        if (i < 2) Assert.assertEquals(i, i);
        i++;
        System.out.println(i);
    }

    @Test
    public void skipTest() {
        throw new SkipException("skip the test method.");
    }

}
