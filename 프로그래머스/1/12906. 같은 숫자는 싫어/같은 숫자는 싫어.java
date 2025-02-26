import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int a : arr) {
            if (stack.isEmpty() || stack.peek() != a) {
                stack.push(a);   
            }
        }
        
        int[] answer = new int[stack.size()];
        for (int i = 0; i < stack.size(); i++) {
            answer[i] = stack.elementAt(i);      
        }
        return answer;
    }
}