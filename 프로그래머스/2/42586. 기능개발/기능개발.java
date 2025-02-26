import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Stack<Integer> stack = new Stack<>();
        Stack<Integer> values = new Stack<>();
        for (int i = 0; i < progresses.length; i++) {
            int x = (100 - progresses[i]) / speeds[i] + ((100 - progresses[i]) % speeds[i] == 0 ? 0 : 1);
            if (stack.isEmpty()) {
                stack.push(x);
                values.push(1);
                continue;
            }
            if (stack.peek() >= x) {
                values.push(values.pop() + 1);
            } else {
                stack.push(x);
                values.push(1);
            }
        }
        int[] answer = new int[values.size()];
        for (int i = 0; i < values.size(); i++) {
            answer[i] = values.elementAt(i);
        }
        return answer;
    }
}