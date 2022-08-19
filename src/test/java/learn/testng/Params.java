package learn.testng;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Author: Lulu
 * @Description: TODO
 * @DateTime: 2022/8/17 19:46
 **/
public class Params {
    @Test
    @Parameters({"val1", "val2"})
    public void sum(int v1, int v2) {
        int sum = v1 + v2;
        System.out.println("sum: " + sum);
    }

    @Test
    @Parameters ({"val1", "val2"})
    public void Diff (int v1, int v2) {
        int finaldiff = v1 - v2;
        System.out.println("The final difference of the given values is " + finaldiff);
    }

    @Test
    @Parameters("message")
    public void optional(@Optional("optional message") String message) {
        System.out.println(message);
        Reporter.log("this is a reporter log");
    }
}
