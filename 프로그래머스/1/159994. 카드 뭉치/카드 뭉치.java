import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

class Solution {
public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "No";
        ArrayDeque<String> arry1 = new ArrayDeque<>(List.of(cards1));
        ArrayDeque<String> arry2 = new ArrayDeque<>(List.of(cards2));
        ArrayDeque<String> arry3 = new ArrayDeque<>(List.of(goal));

        ArrayDeque<String> result = new ArrayDeque<>();

        while (arry3.size()>0) {
            String bin = arry3.pollFirst();

            if(bin.equals(arry1.peekFirst()) && arry1.peekFirst() != null){
                result.add(arry1.pollFirst());

            } else if(bin.equals(arry2.peekFirst()) && arry2.peekFirst() != null){
                result.add(arry2.pollFirst());

            }

        }

        String[] resultArr = result.stream().toArray(String[]::new);

        if(Arrays.equals(resultArr,goal)){
            answer ="Yes";
        }

        return answer;
    }
}