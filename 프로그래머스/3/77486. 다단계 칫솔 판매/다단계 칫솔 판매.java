import java.util.*;

class Solution {
    public int[] solution(String[] enroll, String[] referral, String[] seller, int[] amount) {


        HashMap<String,String>  group = new HashMap<>();
        HashMap<String,Integer>  price = new HashMap<>();

        for (int i = 0; i < enroll.length; i++) {
            group.put(enroll[i],referral[i]);
        }

        for (int i = 0; i <seller.length ; i++) {
           String user = seller[i];
           int money = amount[i] *100;

           while(money > 0 && !user.equals("-")){
                price.put(user,price.getOrDefault(user,0) + money-(money/10));
                user = group.get(user);
                money /=10;
           }
        }

        int[] answer = new int[enroll.length];
        for (int i = 0; i < enroll.length; i++) {
            answer[i] = price.getOrDefault(enroll[i],0);
        }

        return answer;
    }
}