package com.programmers.kakao2020;

import java.util.*;

class Solution {

    int pos; // v의 시작 위치, u의 길

    public String solution(String p) {

        // 빈 문자열이면
        if (p.isEmpty()) {
            return p;
        }
        boolean correct = isCorrect(p);

        // u, v 분리
        String u = p.substring(0, pos);
        String v = p.substring(pos, p.length());

        // 면3. 올바릅 문자열이라
        if(correct){
            return u + solution(v);
        }

        String answer = "(" + solution(v) + ")";

        for (int i = 1; i < u.length() - 1; i++) {
            if(u.charAt(i) == '('){
                answer += ")";
            }else{
                answer += "(";
            }
        }

        return answer;
    }

    boolean isCorrect(String str) {
        boolean ret = true;
        int left = 0;
        int right = 0;

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                left++;
                stack.push('(');
            } else {
                right++;
                if (stack.isEmpty()) {        // 괄호 짝이 안맞으면
                    ret = false;
                } else {
                    stack.pop();
                }
            }
            if (left == right) {
                pos = i + 1;
                return ret;
            }
        }
        return true;
    }
}

public class 괄호변환 {

}
