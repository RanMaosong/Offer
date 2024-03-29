package com.offer;

import java.util.Stack;

/**
 * 包含min函数的栈
 * 题目描述
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */

public class Offer_19 {

    public static void main(String[] args) {

    }
}



class Solution {
    Stack<Integer> s = new Stack<Integer>();
    Stack<Integer> minS = new Stack<Integer>();

    public void push(int node) {
        s.push(node);
        if (minS.isEmpty())
            minS.push(node);
        else {
            int top = minS.peek();
            if (node < top)
                minS.push(node);
        }

    }

    public void pop() {
        int num = s.pop();
        if (minS.peek() == num)
            minS.pop();
    }

    public int top() {
        return s.peek();
    }

    public int min() {
        return minS.peek();
    }
}
