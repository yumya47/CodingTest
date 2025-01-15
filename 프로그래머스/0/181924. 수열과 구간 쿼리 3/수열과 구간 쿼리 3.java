class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int[] query : queries) {
            int temp = answer[query[0]];
            answer[query[0]] = answer[query[1]];
            answer[query[1]] = temp;
        }
        return answer;
    }
}