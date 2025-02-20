class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        boolean answer = s.replace("p", "").length() == s.replace("y", "").length() ? true : false;
        return answer;
    }
}