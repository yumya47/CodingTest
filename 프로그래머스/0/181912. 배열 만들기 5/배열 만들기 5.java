import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (String intS : intStrs) {
            int x = Integer.parseInt(intS.substring(s, s+l));
            if (x > k) {
                answer.add(x);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}