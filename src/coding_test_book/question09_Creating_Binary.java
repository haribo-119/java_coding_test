package coding_test_book;

import java.util.Stack;

public class question09_Creating_Binary {
    public static void main(String[] args) {
        Solution test = new Solution();
        String result = test.solution(27);
        System.out.println(result);
    }
}

class Solution {
    String solution(int decimal) {

        Stack<Integer> stack = new Stack<>();
        int remain = 0;

        while(decimal>0){
            remain  = decimal%2;
            decimal=decimal/2;

            stack.push(remain);
        }

       // Sring의 + 연산은 시간 복잡도 측면에서 성능이 좋지 않음
       // 따라서 StringBuilder를 사용
       StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }

        return sb.toString();
    }
}