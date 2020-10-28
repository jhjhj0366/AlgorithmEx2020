package com.programmers.stacknqueue;

import java.util.Arrays;

class Solution1 {
    public int[] solution(int[] prices) {

        int size = prices.length;
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }
                if (j == answer.length - 1) {
                    answer[i] = j - i;
                }
            }
        }
        return answer;
    }
}


public class 주식가격 {
    public static void main(String[] args) {
        Solution1 s = new Solution1();
        int[] arr = {1, 2, 3, 2, 3};
        System.out.println(Arrays.toString(s.solution(arr)));
    }
}
