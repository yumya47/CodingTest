class Solution {
    public int make(int x) {
        int count = 0;
        while (x != 1) {
            if (x % 2 != 0) {
                x = (x - 1) / 2;
                count += 1;
                continue;
            }
            x /= 2;
            count += 1;
        }
        return count;
    }
    public int solution(int[] num_list) {
        int answer = 0;
        for (int num : num_list) {
            answer += make(num);
        }
        return answer;
    }
}