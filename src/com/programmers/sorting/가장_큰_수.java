package com.programmers.sorting;

// 정렬 : 가장 큰 수 Lv2
// https://programmers.co.kr/learn/courses/30/lessons/42746

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";

        ArrayList<String> arr = new ArrayList<String>();

        for (int i = 0; i < numbers.length; i++) {
            arr.add(String.valueOf(numbers[i]));
        }

        for (int i = 0; i < arr.size(); i++) {
            if (!arr.get(i).equals("0")) {
                break;
            }

            if (i == arr.size() - 1) {
                return "0";
            }
        }

        Collections.sort(arr, new Comparator<String>() {

            @Override
            public int compare(String arg0, String arg1) {

                return (arg1 + arg0).compareTo(arg0 + arg1);
            }
        });

        for (int i = 0; i < arr.size(); i++) {
            answer += arr.get(i);
        }
        return answer;
    }
}

public class 가장_큰_수 {

    public static void main(String[] args) {

        Solution s = new Solution();
        int[] numbers = {3, 30, 34, 5, 9};

        System.out.println(s.solution(numbers));
    }
}