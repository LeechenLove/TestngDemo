package learn.testng;

import org.testng.annotations.Test;

/**
 * @Author: Lulu
 * @Description: 并行测试
 * @DateTime: 2022/8/18 16:11
 **/
public class ParallelTest {
    @Test
    public void p1() {
        System.out.println("并行测试1");
        System.out.println(Thread.currentThread().getId());
    }

    @Test
    public void p2() {
        System.out.println("并行测试2");
        System.out.println(Thread.currentThread().getId());
    }
}
