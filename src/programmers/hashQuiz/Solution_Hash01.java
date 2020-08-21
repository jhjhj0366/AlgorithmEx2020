package programmers.hashQuiz;

// 문제 : 해시 - 완주하지 못한 선수
// https://programmers.co.kr/learn/courses/30/lessons/42576?language=java
// 참가자 중에 동명이인이 있을 수 있다.

import java.util.Arrays;

class Solution1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i =0;

        for(i =0; i<completion.length;i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }
}



public class Solution_Hash01 {

    public static void main(String[] args) {

        Solution1 s = new Solution1();
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        System.out.println(s.solution(participant, completion));
    }
}