class Solution {
    public int[] solution(long n) {
        String x = Long.toString(n);
        int[] answer = new int[x.length()];
        for (int i = x.length() - 1; i > -1; i--) {
            answer[x.length() - 1 - i] = Integer.parseInt(x.charAt(i) + "");
        }
        return answer;
    }
}