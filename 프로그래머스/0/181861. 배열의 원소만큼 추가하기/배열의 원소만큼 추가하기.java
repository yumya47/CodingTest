import java.util.stream.*;
class Solution {
    public int[] solution(int[] arr) {
        String answer = "";
        for (Integer a : arr) {
            answer += (a + " ").repeat(a);
        }
        return Stream.of(answer.split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}