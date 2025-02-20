class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long x = a < b ? a : b;
        long y = a > b ? a : b;
        answer = (y - x + 1) * (x + y) / 2;
        return answer;
    }
}