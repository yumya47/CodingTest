class Solution {
    public String solution(String s) {
        int len = (int)s.length() / 2;
        int index = s.length() % 2 == 0 ? len - 1 : len;
        String answer = s.substring(index, len + 1);
        return answer;
    }
}