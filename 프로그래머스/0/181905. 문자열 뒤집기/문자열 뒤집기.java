class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(0, s);
        for (int end = e; end >= s; end--) {
            answer += my_string.charAt(end);
        }
        answer += my_string.substring(e + 1, my_string.length());
        return answer;
    }
}