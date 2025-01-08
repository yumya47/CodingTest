class Solution {
    public int solution(int a, int b) {
        int A = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int B = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        int answer = A > B ? A : B;
        return answer;
    }
}