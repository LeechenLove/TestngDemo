package learn.testng;

import org.testng.annotations.Test;

/**
 * @Author: Lulu
 * @Description: TODO
 * @DateTime: 2022/8/17 17:13
 **/
public class DependentMethod {
    // dependsOnMethods表示依赖于某个test方法，即logon方法先执行
    @Test(dependsOnMethods = { "logon"})
    public void homepage() {
        System.out.println("the user is on the home page.");
    }

    @Test
    public void logon() {
        System.out.println("the user logon successfully!");
    }
}
