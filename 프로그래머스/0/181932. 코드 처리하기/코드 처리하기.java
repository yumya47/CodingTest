class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = true;
        for (int i = 0; i < code.length(); i++) {
            if (code.charAt(i) == '1') {
                mode = !mode;
                continue;
            }
            if (mode) {
                answer += i % 2 == 0 ? code.charAt(i) : "";
            } else {
                answer += i % 2 != 0 ? code.charAt(i) : "";
            }
        }
        return answer.isEmpty() ? "EMPTY" : answer;
    }
}