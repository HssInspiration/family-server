package com.hss.inspiration.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

/**
 * @author hss
 * @create 2021-05-04 8:43
 * @Desc
 */
@Component
public class MD5Utils {
    /**
     * 获取MD5
     *
     * @param src 源数据
     * @return MD5加密后的字符串
     */
    public static String md5(String src) {
        return DigestUtils.md5Hex(src);
    }

    /**
     * 盐值
     */
    private static final String salt = "VCR2WA2GAMKMJFZEMVVFSFVPXB7ATD8YNXLQO3URZFEE7LGBKI9C1L8DWZIVOA8L";

    /**
     * 生成随机字符串
     *
     * @return 随机字符串
     */
    private static String randomStrBuild() {
        return RandomStringUtils.random(64, true, true).toUpperCase();
    }

    /**
     * 将输入密码进行第一次加密
     *
     * @param inputPass 用户输入明文
     * @return 进行一次加密后的结果
     */
    public static String inputPassToFromPass(String inputPass) {
        String str = salt.charAt(0) + salt.charAt(2) + inputPass + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }

    /**
     * 将随机密码进行二次加密（持久化到DB）
     *
     * @param fromPass 加密一次后的密码
     * @param salt     盐值
     * @return 二次加密后的结果
     */
    public static String fromPassToDBPass(String fromPass, String salt) {
        String str = salt.charAt(0) + salt.charAt(2) + fromPass + salt.charAt(5) + salt.charAt(4);
        return md5(str);
    }

    /**
     * 将明文进行两次MD5加密
     *
     * @param inputPass 明文
     * @param salt      盐值
     * @return 二次加密后的值
     */
    public static String inputPassToDBPass(String inputPass, String salt) {
        String str = inputPassToFromPass(inputPass);
        return fromPassToDBPass(str, salt);
    }

    public static void main(String[] args) {
        // ec1c6544fc3e9faf11c2fba66db789e9
        System.out.println(inputPassToFromPass("123456"));
        System.out.println(fromPassToDBPass("ec1c6544fc3e9faf11c2fba66db789e9", salt));
        System.out.println(inputPassToDBPass("123456", salt));
    }

}
