import java.util.ArrayDeque;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[][] next = new int[][]{progresses,speeds};
        ArrayDeque<Integer>  answer = new ArrayDeque<>();

        int num = next[0].length;
        int[] dayLeft = new int[num];


        for (int i = num-1; i > -1; i--) {
            dayLeft[i] =(int)Math.ceil((100.0 - next[0][i] )/next[1][i]);

        }
        System.out.println(Arrays.toString(dayLeft));

        int count =0;
        int maxDay = dayLeft[0];

        for (int i = 0; i <num; i++) {
            if(dayLeft[i] <= maxDay){
                count++;
            } else {
                answer.add(count);
                count =1;
                maxDay = dayLeft[i];
            }

        }

        answer.add(count);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}