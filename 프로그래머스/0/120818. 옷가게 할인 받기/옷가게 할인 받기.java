class Solution {
    public int solution(int price) {
        double answer = 1;
        if (price / 500000 > 0) {
            answer = 0.8;
        } else if (price / 300000 > 0) {
            answer = 0.9;
        } else if (price / 100000 > 0) {
            answer = 0.95;
        }
        return (int)((double)price * answer);
    }
}