import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answer = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int delete : delete_list) {
            if (answer.contains(delete)) {
                answer.remove(answer.indexOf(delete));
            }
        }
        return answer.stream().mapToInt(Integer::new).toArray();
    }
}