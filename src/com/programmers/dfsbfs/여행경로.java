package com.programmers.dfsbfs;

import java.util.ArrayList;
import java.util.Collections;

class Solution4 {
    boolean[] visited;
    ArrayList<String> list;

    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        list = new ArrayList<String>();
        int cnt = 0;
        dfs(cnt, "ICN", "ICN", tickets);
        Collections.sort(list);
        String[] answer = list.get(0).split(",");
        return answer;
    }

    public void dfs(int cnt, String present, String answer, String[][]ticktes) {

        if(cnt == ticktes.length){
            list.add(answer);
            return;
        }
        for (int i = 0; i < ticktes.length; i++) {
            if (!visited[i] && ticktes[i][0].equals(present)){
                visited[i] = true;
                dfs(cnt+1, ticktes[i][1], answer + ","+ticktes[i][1], ticktes);
                visited[i] = false;
            }
        }
        return;
    }
}


public class 여행경로 {
}


