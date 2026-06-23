class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int res = 0;

        for (int num : set) {
            // Only start counting if num is the beginning of a sequence
            if (!set.contains(num - 1)) {
                int count = 1;
                int current = num;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                res = Math.max(res, count);
            }
        }

        return res;
    }
}
