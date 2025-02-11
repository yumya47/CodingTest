class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            boolean check = true;
            for (Integer indice : indices) {
                if (indice == i) {
                    check = false;
                    break;
                }
            }
            if (check) {
                answer += my_string.charAt(i) + "";    
            }
        }
        return answer;
    }
}