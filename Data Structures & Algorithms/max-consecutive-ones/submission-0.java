class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0, counter = 0;
        for (int num : nums) {
            counter = (num == 1) ? counter + 1 : 0;
            result = Math.max(counter, result);
        }
        return result;
    }
}