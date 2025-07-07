package coding_test_book;

import java.util.ArrayDeque;
import java.util.Stack;

public class question15_queue {
    public static void main(String[] args) {
        Solution_main result = new Solution_main();
        int answer = result.solution(5,2);
        System.out.println(answer);
    }
}

class Solution_main {
    int solution(int people,int remove) {
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 1; i <=people ; i++) {
            queue.addLast(i);
        }

        while (queue.size() >1) {
            for (int i = 0; i < remove-1; i++) {
                queue.addLast(queue.pollFirst());
            }
            queue.pollFirst();
        }

    return queue.pollFirst();
    }
}