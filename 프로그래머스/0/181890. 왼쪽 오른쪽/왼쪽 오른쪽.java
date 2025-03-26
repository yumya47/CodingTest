import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        int idx_l = Arrays.asList(str_list).indexOf("l");
        int idx_r = Arrays.asList(str_list).indexOf("r");
        
        int start = 0;
        int end = 0;
        if (idx_l == -1 && idx_r == -1) {
            return new String[0];
        }
        
        if (idx_l == -1) {
            start = idx_r + 1;
            end = str_list.length;
        } else if (idx_r == -1) {
            end = idx_l;
        } else if (idx_l < idx_r) {
            end = idx_l;
        } else {
            start = idx_r + 1;
            end = str_list.length;
        }
        
        String[] answer = new String[end - start];
        for (int i = start; i < end; i++) {
            answer[i - start] = str_list[i];
        }
        return answer;
    }
}