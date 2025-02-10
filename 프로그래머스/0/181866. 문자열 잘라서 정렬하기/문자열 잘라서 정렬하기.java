import java.util.*;
class Solution {
    public String[] solution(String myString) {
        List<String> answer = new ArrayList<>();
        for (String m : myString.split("x")) {
            if (!m.equals("")) {
                answer.add(m);
            }
        }
        String[] answer2 = answer.stream().toArray(String[]::new);
        Arrays.sort(answer2);
        return answer2;
    }
}