class Solution {
    public int solution(String binomial) {
        String[] arr = binomial.split(" ");
        if (arr[1].equals("*")) {
            return Integer.parseInt(arr[0]) * Integer.parseInt(arr[2]);
        }
        int answer = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1] + arr[2]);
        return answer;
    }
}