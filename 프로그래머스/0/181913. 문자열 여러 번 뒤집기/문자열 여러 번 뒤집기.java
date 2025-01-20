class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for (int[] query : queries) {
            String reverse = "";
            for (int i = query[1]; i >= query[0]; i--) {
                reverse += answer.charAt(i) + "";
            }            
            String pre = answer.substring(0, query[0]);
            String post = answer.substring(query[1] + 1, answer.length());
            answer = pre + reverse + post;
        }
        return answer;
    }
}