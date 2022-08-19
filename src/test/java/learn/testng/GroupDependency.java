package learn.testng;

import org.testng.annotations.Test;

/**
 * @Author: Lulu
 * @Description: TODO
 * @DateTime: 2022/8/17 17:26
 **/
public class GroupDependency {

    @Test(dependsOnGroups = {"Login"})
    public void ViewAcc() {
        System.out.println("View Your Dashboardd");
    }

    @Test(groups = {"Login"})
    public void OpenBrowser() {
        System.out.println("Browser Opened Successfully");
    }

    @Test(groups = {"Login"})
    public void Login() {
        System.out.println("Login Into The Account");
    }
}
