package learn.testng;

import learn.listener.RetryAnalyzer;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Author: Lulu
 * @Description: TODO
 * @DateTime: 2022/8/18 20:58
 **/
public class TestRetry {
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void Test1()
    {
        Assert.assertEquals(false, true);
    }

    @Test
    public void Test2()
    {
        Assert.assertEquals(false, true);
    }
}
