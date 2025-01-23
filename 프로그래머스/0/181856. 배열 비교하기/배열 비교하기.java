class Solution {
    public int sum(int[] arr) {
        int s = 0;
        for (Integer a : arr) {
            s += a;
        }
        return s;
    }
    
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if (arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else {
            int x = sum(arr1);
            int y = sum(arr2);
            answer = x > y ? 1 : x < y ? -1 : 0;
        }
        return answer;
    }
}