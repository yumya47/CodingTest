import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        int last = num_list.length;
        for (int i = 0; i < last; i++) {
                answer.add(num_list[i]);
        }
    
        if (num_list[last - 1] > num_list[last - 2]) {
            answer.add(num_list[last - 1] - num_list[last - 2]);
        } else {
            answer.add(num_list[last - 1] * 2);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}