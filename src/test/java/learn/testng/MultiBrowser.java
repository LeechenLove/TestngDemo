package learn.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Author: Lulu
 * @Description: 跨浏览器测试的例子
 * @DateTime: 2022/8/17 21:58
 **/
public class MultiBrowser {

    @Parameters("browser")
    @BeforeClass
    public void beforeTest(String browser) {
        if(browser.equalsIgnoreCase("firefox")) {
            System.out.println("firefox web");
        } else if(browser.equalsIgnoreCase("chrome")){
            System.out.println("chrome web");
        }
    }

    @Test public void login() {
        System.out.println("login");
    }

    @AfterClass public void afterTest() {
        System.out.println("after test");
    }
}
