import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int anwser = 0;
        int choice = nums.length/2;

      HashSet<Integer> set = new HashSet();

      for(int send : nums){
          set.add(send);
      }
        System.out.println(set);

      if(choice<=set.size()){
          return  choice;

      } else if(choice >= set.size()){
          return set.size();
      }
        return anwser;
    }
}