class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        for (int j = 0; j < answer.length; j++) { 
            answer[j] = start_num--;
        }
        return answer;
    }
}