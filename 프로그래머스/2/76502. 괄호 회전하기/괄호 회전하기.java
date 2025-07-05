import java.util.*;
class Solution {
    public int solution(String s) {
           int result = 0;
        StringBuilder sb = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++) {
            if (i != 0) {
                char first = sb.charAt(0);
                sb.deleteCharAt(0);
                sb.append(first);
            }
            if (isValid(sb.toString())) {
                result++;
            }
        }
        return result;
    }

    boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!isPair(top, c)) return false;
            }
        }
        return stack.isEmpty();
    }

    boolean isPair(char open, char close) {
        return (open == '(' && close == ')') ||
               (open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}