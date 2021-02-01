package top.jolyoulu.common;


import org.junit.Test;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/1 10:51
 * @Version 1.0
 */
public class JLStringUtilsTest {

    @Test
    public void numberToString() {
        System.out.println(JLStringUtils.numberToString(1, 3));
        System.out.println(JLStringUtils.numberToString(12, 3));
        System.out.println(JLStringUtils.numberToString(123, 3));
        System.out.println(JLStringUtils.numberToString(123, null));
    }
}