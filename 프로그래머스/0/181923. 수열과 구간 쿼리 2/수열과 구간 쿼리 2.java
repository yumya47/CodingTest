class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x = 1000001;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && arr[j] < x) {
                    x = arr[j];
                }
            }
            answer[i] = x == 1000001 ? -1 : x;
        }
        return answer;
    }
}