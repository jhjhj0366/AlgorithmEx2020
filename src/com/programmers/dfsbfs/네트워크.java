package com.programmers.dfsbfs;

//프로그래머스 DFS Lv3. 네트워크
// https://programmers.co.kr/learn/courses/30/lessons/43162?language=java


class Solution {
    static boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[computers.length];       // 방문한 node

        for (int i = 0; i < computers.length; i++) {
            visited[i] = false;
        }

        for (int i = 0; i < computers.length; i++) {
            if (!visited[i]){
                answer++;
                dfs(i, visited, computers);
            }
        }
        return answer;
    }

    public void dfs(int node, boolean[] visited,  int[][] computers){
        visited[node] = true;
        for (int i = 0; i < computers.length; i++) {
            if (visited[i]==false && computers[node][i]==1){
                dfs(i, visited, computers);
            }
        }

    }
}

public class 네트워크 {

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 0;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(s.solution(n, computers));
    }
}
