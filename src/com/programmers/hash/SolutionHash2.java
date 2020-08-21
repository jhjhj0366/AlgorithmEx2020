package com.programmers.hash;


// 문제 : 해시 - 전화번호 목록
// https://programmers.co.kr/learn/courses/30/lessons/42577?language=java

class Solution2 {
    public boolean solution(String[] phone_book) {

        boolean answer = true;
        for (int i = 0; i < phone_book.length; i++) {
            for (int j = 0; j < phone_book.length; j++) {
                if (phone_book[i].equals(phone_book[j])) {
                    continue;
                }
                if(phone_book[j].indexOf(phone_book[i])==0){
                    answer =  false;
                }
            }
        }
        return answer;
    }
}

public class SolutionHash2 {

    public static void main(String[] args) {
        //String[] pb = {"12", "123", "1235", "567", "88"};
        //String[] pb = {"119", "97674223", "1195524421"};
        String[] pb = {"123", "456", "789"};

        Solution2 s = new Solution2();
        System.out.println(s.solution(pb));
    }
}