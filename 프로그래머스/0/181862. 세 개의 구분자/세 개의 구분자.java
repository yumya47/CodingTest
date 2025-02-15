import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("a", " ");
        myStr = myStr.replace("b", " ");
        myStr = myStr.replace("c", " ");
        List<String> answer = new ArrayList<>();
        for (String str : myStr.split(" ")) {
            if (!str.equals("")) {
                answer.add(str);
            }
        }
        if (answer.size() == 0) {
            answer.add("EMPTY");
        }
        return answer.stream().toArray(String[]::new);
    }
}