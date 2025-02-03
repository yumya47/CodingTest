class Solution {
    public int sum(int start, int[] num_list) {
        int s = 0;
        for (int i = start; i < num_list.length; i+=2) {
            s += num_list[i];
        }
        return s;
    }
    
    public int solution(int[] num_list) {
        int even = sum(0, num_list);
        int odd = sum(1, num_list);
        int answer = even > odd ? even : odd;
        return answer;
    }
}