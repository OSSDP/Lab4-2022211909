package edu.hit;

import org.junit.Assert;
import org.junit.Test;
public class L2022211909_10_Test {
    private Solution10 solution = new Solution10();
    /**
     * 测试用例设计的总体原则：
     * 1. 等价类划分原则：确保覆盖所有可能的输入情况，包括边界值。
     * 2. 边界值分析：测试输入的边界条件，确保程序在边界上的正确性。
     * 3. 错误猜测：测试预期可能出错的情况，确保程序能够正确处理异常。
     * 4. 测试覆盖：确保代码的每个分支和路径都被测试到。
     */
    // 测试用例1
    @Test
    public void test1() {
        // 测试目的：验证两个相反的分数相加的结果是否正确
        // 测试用例："-1/2+1/2"
        // 预期结果："0/1"
        Assert.assertEquals("0/1", solution.fractionAddition("-1/2+1/2"));
    }
    // 测试用例2
    @Test
    public void test2() {
        // 测试目的：验证多个分数相加的结果是否正确
        // 测试用例："-1/2+1/2+1/3"
        // 预期结果："1/3"
        Assert.assertEquals("1/3", solution.fractionAddition("-1/2+1/2+1/3"));
    }
    // 测试用例3
    @Test
    public void test3() {
        // 测试目的：验证分数相减的结果是否正确
        // 测试用例："1/3-1/2"
        // 预期结果："-1/6"
        Assert.assertEquals("-1/6", solution.fractionAddition("1/3-1/2"));
    }
    // 测试用例4
    @Test
    public void test4() {
        // 测试目的：验证分数与整数相加的结果是否正确
        // 测试用例："1/1+1/2"
        // 预期结果："3/2"
        Assert.assertEquals("3/2", solution.fractionAddition("1/1+1/2"));
    }

    // 测试用例5
    @Test
    public void test5() {
        // 测试目的：验证分数与整数相减的结果是否正确
        // 测试用例："1/1-1/2"
        // 预期结果："1/2"
        Assert.assertEquals("1/2", solution.fractionAddition("1/1-1/2"));
    }

    // 测试用例6
    @Test
    public void test6() {
        // 测试目的：验证整数与分数相加的结果是否正确
        // 测试用例："1/2+1/1"
        // 预期结果："3/2"
        Assert.assertEquals("3/2", solution.fractionAddition("1/2+1/1"));
    }

    // 测试用例7
    @Test
    public void test7() {
        // 测试目的：验证整数与分数相减的结果是否正确
        // 测试用例："1/1-1/2"
        // 预期结果："1/2"
        Assert.assertEquals("1/2", solution.fractionAddition("1/1-1/2"));
    }

    // 测试用例8
    @Test
    public void test8() {
        // 测试目的：验证多个整数和分数相加的结果是否正确
        // 测试用例："1/1+1/2+1/1+1/3"
        // 预期结果："17/6"
        Assert.assertEquals("17/6", solution.fractionAddition("1/1+1/2+1/1+1/3"));
    }

    // 测试用例9
    @Test
    public void test9() {
        // 测试目的：验证空表达式的结果是否正确
        // 测试用例：""
        // 预期结果："0/1"
        Assert.assertEquals("0/1", solution.fractionAddition(""));
    }

    // 测试用例10
    @Test
    public void test10() {
        // 测试目的：验证只有整数的表达式的结果是否正确
        // 测试用例："1/1+2/1"
        // 预期结果："3/1"
        Assert.assertEquals("4/1", solution.fractionAddition("1/1+2/1"));
    }
}
