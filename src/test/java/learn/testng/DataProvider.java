package learn.testng;

import org.testng.annotations.Test;

/**
 * @Author: Lulu
 * @Description: 如何使用其他类的dataprovider例子
 * @DateTime: 2022/8/17 20:34
 **/
public class DataProvider {
    @Test(dataProvider = "data-provider", dataProviderClass = DP.class)
    public void myTest(String val) {
        System.out.println("current value: " + val);
    }
}
