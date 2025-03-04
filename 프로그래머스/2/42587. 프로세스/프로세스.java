import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> qi = new LinkedList<>();
        for (int i = 0; i < priorities.length; i++) {
            q.add(priorities[i]);
            qi.add(i);
        }
        Arrays.sort(priorities);
        int idx = priorities.length - 1;
        while (!q.isEmpty()) {
            int x = q.peek();
            int xi = qi.peek();
            q.remove(x);
            qi.remove(xi);
            if (priorities[idx] == x) {
                if (xi == location) {
                    break;
                }
                answer++;
                idx--;
            } else {
                q.add(x);
                qi.add(xi);
            }
        }
        return answer;
    }
}