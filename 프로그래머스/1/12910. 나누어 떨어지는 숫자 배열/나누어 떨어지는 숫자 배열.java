import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> answer = new ArrayList<>();
        for (int a : arr) {
            if (a % divisor == 0) {
                answer.add(a);
            }
        }
        if (answer.size() == 0) {
            answer.add(-1);
        }
        answer.sort(Comparator.naturalOrder());
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}