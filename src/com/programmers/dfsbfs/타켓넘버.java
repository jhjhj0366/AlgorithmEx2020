package com.programmers.dfsbfs;


class Solution3 {

    int dfsSum = 0;
    public int solution(int[] numbers, int target) {

        int answer = dfs(0, 0, numbers, target);
        return answer;
    }

    public int dfs(int idx, int sum, int[] numbers, int target) {

        if (idx == numbers.length) {
            if (sum == target) {
                dfsSum++;
            }
        } else {
            dfs(idx + 1, sum + numbers[idx], numbers, target);
            dfs(idx + 1, sum - numbers[idx], numbers, target);

        }
        return dfsSum;
    }
}


public class 타켓넘버 {

    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 1, 1};
        int target = 3;

        Solution3 solution3 = new Solution3();
        System.out.println(solution3.solution(numbers, target));


    }
}
