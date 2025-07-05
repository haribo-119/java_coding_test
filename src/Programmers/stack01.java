package Programmers;


import java.util.Arrays;
import java.util.Stack;

// 주식 가격
public class stack01 {
    public static void main(String[] args) {

        Solution test = new Solution();

        int[] arr = new int[]{1, 2, 3, 2, 3};
        int[] result = test.solution(arr);
        System.out.println(Arrays.toString(result)); // [4,3,1,1,0]
    }

}

class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            // 가격이 떨어지는 시점 처리
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                int idx = stack.pop();
                answer[idx] = i - idx;
            }
            stack.push(i);
        }

        // 끝까지 가격이 떨어지지 않은 경우 처리
        while (!stack.isEmpty()) {
            int idx = stack.pop();
            answer[idx] = n - 1 - idx;
        }

        return answer;

    }

}
