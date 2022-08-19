package learn.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @Author: Lulu
 * @Description: Implementing ITestListener At Class Level
 * @DateTime: 2022/8/18 18:55
 **/
public class ListenersTestNG implements ITestListener {
    @Override
    public void onStart(ITestContext context) {
        System.out.println("onStart method started");
    }

    @Override
    public void onFinish(ITestContext context) {
        System.out.println("onFinish method started");
    }

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("New Test Started " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("onTestSuccess method " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("onTestFailure method " + result.getName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("onTestSkipped method " + result.getName());
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("onTestFailedButWithinSuccessPercentage method " + result.getName());
    }
}
