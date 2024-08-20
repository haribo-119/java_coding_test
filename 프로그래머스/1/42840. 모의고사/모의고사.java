import java.util.*;
class Solution {
        public static int[] solution(int[] answers) {

        int[][] patten = {
                {1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}
        };

        int[] scores = new int[3];

        for(int i=0; i<answers.length; i++){
            for(int j=0; j< patten.length; j++){
                if(answers[i] == patten[j][i % patten[j].length]){
                    scores[j]++;
                }
            }
        }

        int maxScore = Arrays.stream(scores).max().getAsInt();

        ArrayList<Integer> anwser = new ArrayList<>();
        for(int i =0; i<scores.length; i++){
            if(scores[i] == maxScore){
                anwser.add(i+1);
            }
        }


            return anwser.stream().mapToInt(Integer::intValue).toArray();
        }

}