package learn.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @Author: Lulu
 * @Description: 测试数据驱动
 * @DateTime: 2022/8/18 9:06
 **/
public class DataProviderTest {

    @DataProvider(name = "Authentication")
    public static Object[][] credentials() {
        return new Object[][] {{"test1", "password1"}, {"test2", "password2"}};
    }

    @Test(dataProvider = "Authentication")
    public void test(String name, String password) {
        System.out.println(name);
        System.out.println(password);
    }
}
