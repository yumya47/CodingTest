class Solution {
    public int solution(int[] num_list) {
        String a = "";
        String b = "";
        for (Integer num : num_list) {
            if (num % 2 == 0) {
                a += num + "";
            } else {
                b += num + "";
            }
        }
        int answer = Integer.parseInt(a) + Integer.parseInt(b);
        return answer;
    }
}