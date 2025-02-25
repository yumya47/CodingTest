class Solution {
    public boolean check(int x) {
        int count = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                count++;
            }
        }
        return count % 2 == 0;
    }
    
    public int solution(int left, int right) {
        int answer = 0;
        for (int i = left; i <= right; i++) {
            if (check(i)) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}