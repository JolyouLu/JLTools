package top.jolyoulu.common;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/1 10:03
 * @Version 1.0
 */
public class JLStringUtils {

    /**
     * <p>数字转字符串指定字符串长度转换后会在字符串前面自动补"0"</p>
     *
     * <pre>
     * JStringUtils.numberToString(1,3)       = 001
     * JStringUtils.numberToString(12,3)      = 012
     * JStringUtils.numberToString(123,3)     = 123
     * JStringUtils.numberToString(123,null)  = 123
     * JStringUtils.numberToString(123,1)     = IllegalArgumentException
     * JStringUtils.numberToString(null,1)    = IllegalArgumentException
     * </pre>
     *
     * <p>注意:</p>
     * <ul>
     *   <li>如果 {@code num} = null，返回{@code IllegalArgumentException}</li>
     *   <li>如果 {@code num} > {@code numLength}，返回{@code IllegalArgumentException}</li>
     *   <li>如果 {@code numLength} = null，返回转换后的String</li>
     * </ul>
     *
     * @param num 要转换的数字，不能为Null
     * @param numLength 转换后String的长度
     * @return 指定长度的String
     */
    public static String numberToString(Integer num,Integer numLength){
        if (num == null){
            throw new IllegalArgumentException("num is not null");
        }

        String str = String.valueOf(num);

        if (numLength == null){
            numLength = str.length();
        }

        if (str.length() > numLength){
            throw new IllegalArgumentException("num.length more than the numLength.length");
        }

        int length = numLength - str.length();
        for (int i = 0; i < length; i++) {
            str = "0" + str;
        }
        return str;
    }

}
