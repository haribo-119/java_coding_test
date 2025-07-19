import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        HashMap<String, String> map = new HashMap<>();
        List<String> answerList = new ArrayList<>();
        List<String> idList = new ArrayList<>();
        List<String> wordList = new ArrayList<>();

        for (int i = 0; i < record.length; i++) {
            String[] arr = record[i].split(" ");
            String swich = arr[0];
            String id = arr[1];

            if (swich.equals("Enter") || swich.equals("Change")) {
                String neckName = arr[2];
                map.put(id, neckName);
            }

            if (swich.equals("Enter")) {
                idList.add(id);
                wordList.add("님이 들어왔습니다.");
            } else if (swich.equals("Leave")) {
                idList.add(id);
                wordList.add("님이 나갔습니다.");
            }
        }

        for (int i = 0; i < idList.size(); i++) {
            String id = idList.get(i);
            String value = map.get(id) + wordList.get(i);
            answerList.add(value);
        }

        return answerList.toArray(new String[0]);
    }
}