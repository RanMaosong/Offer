package com.offer;
/**
 * 替换空格
 * 题目描述
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Offer_02 {
    public String replaceSpace(StringBuffer str) {
        StringBuilder res = new StringBuilder();
        char[] cs = str.toString().toCharArray();
        for (char c : cs) {
            if (c == ' ') {
                res.append("%20");
            } else {
                res.append(c);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {

    }
}
