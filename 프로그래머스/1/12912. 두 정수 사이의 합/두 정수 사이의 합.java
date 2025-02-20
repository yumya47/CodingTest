class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long x = a < b ? a : b;
        long y = a > b ? a : b;
        for (long i = x; i <= y; i++) {
            answer += i;
        }
        return answer;
    }
}