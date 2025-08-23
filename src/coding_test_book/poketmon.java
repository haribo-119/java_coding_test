package coding_test_book;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class poketmon {
    public static void main(String[] args) {
        Solutions result = new Solutions();

        int[] nums = {3,3,3,2,2,2};

        int answer = result.solution(nums);
        System.out.println(answer);

    }
}


class Solutions {
    public int solution(int[] nums) {
        HashSet<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toCollection(HashSet::new));

        int n = nums.length;
        int k = n/2;

        return Math.min(k, set.size());
    }
}