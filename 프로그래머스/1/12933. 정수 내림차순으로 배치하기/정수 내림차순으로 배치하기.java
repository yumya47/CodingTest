import java.util.*;
import java.lang.Math;
class Solution {
    public long solution(long n) {
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Comparator.reverseOrder());
        long answer = 0;
        long x = (long)Math.pow(10, arr.length) / 10;
        for (int i = 0; i < arr.length; i++) {
            answer += Long.parseLong(arr[i]) * x;
            x /= 10;
        }
        return answer;
    }
}