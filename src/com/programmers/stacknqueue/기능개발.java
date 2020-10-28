package com.programmers.stacknqueue;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] day = new int[progresses.length];
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = {};

        for (int i = 0; i < progresses.length; i++) {
            day[i] = (100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i] : (100 - progresses[i]) / speeds[i] + 1;
        }

        int cnt = 1;
        for (int i = 0; i < day.length - 1; i++) {
            if (day[i] >= day[i + 1]) {
                cnt++;
            } else {
                list.add(cnt);
                cnt = 1;
            }
        }
        if(day[day.length-1] > day[day.length-2] || day[day.length-1] == 0){
            list.add(1);
        }else{
            list.add(cnt);
        }

        answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

public class 기능개발 {
    public static void main(String[] args) {
        Solution s = new Solution();
//        int[] p = {93, 30, 55};
//        int[] sp = {1, 30, 5};

        int[] p = {95, 90, 99, 99, 80, 99};
        int[] sp = {1, 1, 1, 1, 1, 1};
        System.out.println(Arrays.toString(s.solution(p, sp)));
    }
}
