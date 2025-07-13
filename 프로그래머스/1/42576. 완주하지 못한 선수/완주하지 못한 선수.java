import java.util.*;

class Solution {
   public String solution(String[] participant, String[] completion) {
        String answer = "";

        HashMap<String,Integer> finish = new HashMap<>();

        for(String dumy : completion){
            finish.put(dumy, finish.getOrDefault(dumy,0)+1);

        }

       for(String dumy : participant){
           if(finish.getOrDefault(dumy,0) == 0){
               return dumy;
           }
           finish.put(dumy, finish.get(dumy)-1);
       }


        return null;
    }
}