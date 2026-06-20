class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2*n];
        for (int i = 0; i<n; i++) {
            int number = nums[i];
            ans[i] = number;
            ans[i + n] = number;
        }
    return ans;
    }
}