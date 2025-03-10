class Solution {
    public int solution(int num) {
        int answer = 0;
        double x = (double)num;
        for (int i = 1; i <= 500; i++) {
            if (x % 2 == 0) {
                x /= 2;
            } else {
                x = x * 3 + 1;
            }
            if (x == 1) {
                answer = i;
                break;
            }
            if (i == 500) {
                answer = -1;
            }
        }
        return num == 1 ? 0 : answer;
    }
}