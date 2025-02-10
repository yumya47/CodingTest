class Solution {
    public int solution(int[] array) {
        int answer = 0, mark = 0;
        int[] arr = new int[1001];
        if(array.length == 1) {
            return array[0];
        }
        for(int i = 0; i < array.length; i++) {
            arr[array[i]]++;
        }
        for(int i = 0; i < arr.length; i++) {
            if(mark < arr[i]) {
                answer = i;
                mark = arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(answer != i && mark == arr[i]) {
                return -1;
            }
        }
        return answer;
    }
}