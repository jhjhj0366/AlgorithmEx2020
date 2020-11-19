package com.programmers.kakao2019;

import java.util.ArrayList;
import java.util.HashMap;

class Solution03 {
    public String[] solution(String[] record) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < record.length; i++) {
            String arr[] = record[i].split(" ");
            if(arr.length == 3){
                map.put(arr[1], arr[2]);
            }
        }

        for (int i = 0; i < record.length; i++) {
            String arr[] = record[i].split(" ");
            if(arr[0].equals("Enter")){
                list.add(map.get(arr[1]) + "님이 들어왔습니다.");
            }else if(arr[0].equals("Leave")){
                list.add(map.get(arr[1]) + "님이 나갔습니다.");
            }
        }
        return list.toArray(new String[list.size()]);
    }
}

public class 오픈채팅방 {

    public static void main(String[] args) {
        Solution03 sol = new Solution03();
        String[] recode = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        //System.out.println(Arrays.toString(sol.solution(recode)));
    }
}
