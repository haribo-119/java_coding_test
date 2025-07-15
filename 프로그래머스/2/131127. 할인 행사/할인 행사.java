import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int count = 0;
        int window = 10;

        for (int x = 0; x <= discount.length - window; x++) {
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < want.length; i++) {
                map.put(want[i], number[i]);
            }

            for (int i = x; i < x + window; i++) {
                if (map.containsKey(discount[i])) {
                    map.put(discount[i], map.get(discount[i]) - 1);
                }
            }

            boolean ok = true;
            for (int v : map.values()) {
                if (v > 0) ok = false;
            }
            if (ok) count++;
        }
        return count;
    }
}