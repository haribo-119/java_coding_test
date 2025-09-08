import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {

        // 필터
        int Pass = relayTest(words);

        int human = 0;
        int area = 0;

        if(Pass !=0){
            human = (Pass % n) +1;
            area = (Pass / n ) +1;
        }

        int[] answer = {human,area};

        return answer;
    }
    public int relayTest(String[] words){
        Set<String> usedWords = new HashSet<>();
        char lastChar = words[0].charAt(words[0].length()-1);
        usedWords.add(words[0]);

        for(int i = 1; i <words.length ; i++) {
            String word = words[i];
            char firstChar = word.charAt(0);

            if(usedWords.contains(word) || lastChar != firstChar){
                return i;
            }

            usedWords.add(word);
            lastChar = word.charAt(word.length()-1);
        }
        return 0;
    }
}