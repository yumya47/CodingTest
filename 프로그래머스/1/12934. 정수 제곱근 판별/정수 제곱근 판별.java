import java.lang.Math;
class Solution {
    public long solution(long n) {
        long x = (long)Math.sqrt(n) / 1;
        long answer = Math.pow(x, 2) == n ? (long)Math.pow(x + 1, 2) : -1;
        return answer;
    }
}