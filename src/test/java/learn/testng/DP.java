package learn.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

/**
 * @Author: Lulu
 * @Description: TODO
 * @DateTime: 2022/8/17 20:31
 **/
public class DP {
    @DataProvider (name = "data-provider")
    public Object[][] dpMethod() {
        return new Object[][] {{"First-value"}, {"Second-value"}};
    }

    @DataProvider (name = "data-provider1")
    public Object[][] dpMethod1() {
        return new Object[][] {{2, 3, 5}, {5, 7, 12}};
    }

    @Test(dataProvider = "data-provider")
    public void myTest(String val) {
        System.out.println("passed parameter is: " + val);
    }

    @Test(dataProvider = "data-provider1")
    public void myTest1(int a, int b, int result) {
        int sum = a + b;
        System.out.println(sum);
        Assert.assertEquals(result, sum);
    }

    @DataProvider (name = "method-provider")
    public Object[][] dpMethod3(Method m) {
        switch (m.getName()) {
            case "Sum":
                return new Object[][] {{2, 3 , 5}, {5, 7, 9}};
            case "Diff":
                return new Object[][] {{2, 3, -1}, {5, 7, -2}};
            default:
                return null;
        }
    }

    // softAssert,默认是强断言
    @Test(dataProvider = "method-provider")
    public void Sum(int a, int b, int result) {
        SoftAssert softAssert = new SoftAssert();
        int sum = a + b;
        softAssert.assertEquals(sum, result);
        System.out.println(sum);
    }

    @Test(dataProvider = "method-provider")
    public void Diff(int a, int b, int result) {
        int diff = a - b;
        Assert.assertEquals(diff, result);
    }
}
