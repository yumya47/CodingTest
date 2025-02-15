import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer.add(arr[i]);
                }
            } else {
                int len = answer.size();
                for (int j = len - 1; j >= len - arr[i]; j--) {
                    answer.remove(j);
                }
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}