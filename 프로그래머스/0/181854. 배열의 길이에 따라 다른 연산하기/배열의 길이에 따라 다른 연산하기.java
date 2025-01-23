class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = arr;
        int start = 1;
        if (arr.length % 2 != 0) {
            start = 0;
        } 
        for (int i = start; i < arr.length; i += 2) {
            answer[i] += n; 
        }
        return answer;
    }
}