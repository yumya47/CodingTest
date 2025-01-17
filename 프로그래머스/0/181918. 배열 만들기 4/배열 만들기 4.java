import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.push(arr[i]);
                i += 1;
            } else if (stk.peek() < arr[i]) {
                stk.push(arr[i]);
                i += 1;
                
            } else {
                stk.pop();
            }
        }
        int[] answer = new int[stk.size()];
        for (int x = answer.length - 1; x > -1; x--) {
            answer[x] = stk.pop();
        }
        return answer;
    }
}