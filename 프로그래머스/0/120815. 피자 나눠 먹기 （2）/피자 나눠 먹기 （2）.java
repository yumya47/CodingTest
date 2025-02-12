class Solution {
    public int solution(int n) {
        int gcd = n > 6 ? 6 : n;
        int answer = 1;
        for (int i = gcd; i > 0; i--) {
            if (n % i == 0 && 6 % i == 0) {
                answer = i;
                break;
            }
        }
        return n / answer;
    }
}