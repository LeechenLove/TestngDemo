package learn.testng;

import CustomAnnotations.RetryCountIfFailed;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @Author: Lulu
 * @Description: TODO
 * @DateTime: 2022/8/18 21:02
 **/
public class Testannotation {
    @Test
    @RetryCountIfFailed(10)
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
