class Solution {
    public int solution(int a, int b) {
        int A = Integer.parseInt("" + a + b);
        int B = 2 * a * b;
        int answer = A > B ? A : B;
        return answer;
    }
}