class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int i = 0; i < queries.length; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                answer[j] += j % queries[i][2] == 0 ? 1 : 0;
            }
        }
        return answer;
    }
}