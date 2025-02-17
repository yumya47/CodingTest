import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = 0;
        int end = 0;
        int step = 1;
        if (n == 1) {
            end = slicer[1];
        } else if (n == 2) {
            start = slicer[0];
            end = num_list.length - 1;
        } else if (n == 3) {
            start = slicer[0];
            end = slicer[1];
        } else {
            start = slicer[0];
            end = slicer[1];
            step = slicer[2];
        }
        List<Integer> answer = new ArrayList<>();
        for (int i = start; i <= end; i += step) {
            answer.add(num_list[i]);
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}