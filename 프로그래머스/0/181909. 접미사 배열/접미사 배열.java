import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            answer.add(my_string.substring(i, my_string.length()));
        }
        answer.sort(Comparator.naturalOrder());
        return answer.stream().toArray(String[]::new);
    }
}