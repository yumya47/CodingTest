class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n / k];
        int savedK = k;
        for (int i = 0; savedK <= n; i++) {
            answer[i] = savedK;
            savedK += k;
        }
        return answer;
    }
}