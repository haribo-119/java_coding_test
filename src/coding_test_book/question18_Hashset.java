package coding_test_book;

import java.util.HashSet;

public class question18_Hashset {
    public static void main(String[] args) {
        Solution_sub result = new Solution_sub();

        int[] arr = new int[]{1,2,3,4,8};
        int target = 6;

        boolean answer = result.solution(arr, target);
        System.out.println(answer);
    }
}


class Solution_sub {
    public Boolean solution(int[] arr, int target) {

        HashSet<Integer> flow = new HashSet<>();
        for(int num : arr){
        if(flow.contains(target-num)){
            return true;
        }
        flow.add(num);

        }


        return false;
    }
}