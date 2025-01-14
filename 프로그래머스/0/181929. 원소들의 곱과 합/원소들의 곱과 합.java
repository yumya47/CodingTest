import java.lang.Math;
class Solution {
    public int solution(int[] num_list) {
        int a = 1;
        int b = 0;
        for (Integer num : num_list) {
            a *= num;
            b += num;
        }
        return a < Math.pow(b, 2) ? 1 : 0;
    }
}