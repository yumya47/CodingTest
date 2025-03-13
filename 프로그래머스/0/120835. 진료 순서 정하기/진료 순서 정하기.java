import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        
        Integer[] sorted = Arrays.stream(emergency).boxed().toArray(Integer[]::new); //Integer 배열로 변환
        
        List<Integer> change = Arrays.stream(emergency).boxed().collect(Collectors.toList()); //list로 변환
        
        Arrays.sort(sorted, Collections.reverseOrder()); //내림차순 정렬
        
        for (int i = 0; i < sorted.length; i++) {
            int idx = change.indexOf(sorted[i].intValue());
            answer[idx] = i + 1;
        }
        
        return answer;
    }
}