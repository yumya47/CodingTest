class Solution {
    public boolean solution(int x) {
        String y = Integer.toString(x);
        int sum = 0;
        for (int i = 0; i < y.length(); i++) {
            sum += Integer.parseInt(y.charAt(i) + "");
        }
        boolean answer = x % sum == 0 ? true : false;
        return answer;
    }
}