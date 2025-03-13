import java.math.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        int half = (int)Math.sqrt(n);
        for (int i = 1; i <= half; i++) {
            if (n % i == 0) {
                answer += n / i == i ? 1 : 2;
            }
        }
        return answer;
    }
}