class Solution {
    public int solution(int[] date1, int[] date2) {
        int x = date1[0] * 365 + date1[1] * 60 + date1[2];
        int y = date2[0] * 365 + date2[1] * 60 + date2[2];
        int answer = x < y ? 1 : 0;
        return answer;
    }
}