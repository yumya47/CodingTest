import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<String> convert_arr = Arrays.asList(Arrays.toString(arr).split("[\\[\\]]")[1].split(", "));
        int end = convert_arr.lastIndexOf("2");
        int start = convert_arr.indexOf("2");
        if (end + start < 0) {
            return new int[]{-1};
        }
        int[] answer = new int[end - start + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[start++];
        }
        return answer;
    }
}