class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (Integer num : numbers) {
            answer += num;
            if (answer > n) {
                break;
            }
        }
        return answer;
    }
}