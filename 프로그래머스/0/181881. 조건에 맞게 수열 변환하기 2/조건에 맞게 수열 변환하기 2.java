class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        while (true) {
            int check = 0;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] % 2 == 0 && arr[i] >= 50) {
                    arr[i] /= 2;
                } else if (arr[i] % 2 != 0 && arr[i] < 50) {
                    arr[i] = arr[i] * 2 + 1;
                } else {
                    check++;
                }
            }
            if (check == arr.length) {
                break;
            }
            answer++;
        }
        return answer;
    }
}