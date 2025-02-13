class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int end = pat.length();
        for (int i = 0; i < myString.length() - end + 1; i++) {
            String x = myString.substring(i, i + end);
            if (x.equals(pat)) {
                answer += 1;
            }
        }
        return answer;
    }
}