class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (int i = 0; i < my_string.length(); i++) {
            Character x = my_string.charAt(i);
            if (x >= 'A' && x <= 'Z') {
                answer[x - 'A']++;    
            } else {
                answer[x - 'a' + 26]++;
            }
        }
        return answer;
    }
}