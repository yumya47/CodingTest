class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                answer[i] += 1;
            }
        }
        return answer;
    }
}