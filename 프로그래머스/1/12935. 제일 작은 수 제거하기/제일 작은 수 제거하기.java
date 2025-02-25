import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int a : arr) {
            answer.add(a);
        }
        Arrays.sort(arr);
        if (answer.size() == 1) {
            answer.clear();
            answer.add(-1);
        } else {
            answer.remove(Integer.valueOf(arr[0]));    
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}