class Solution {
    public int[] solution(int n) {
        int a = n % 2 == 0 ? n / 2 : n / 2 + 1;
        int[] answer = new int[a];
        for(int i = 0, j = 1; j <= n; i++, j += 2) {
            answer[i] = j;
        }
        return answer;
    }
}