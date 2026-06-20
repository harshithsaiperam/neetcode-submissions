class Solution {
    public int[] replaceElements(int[] arr) {
        int[] ans = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int rMax = -1;

            for (int high = i + 1; high < arr.length; high++) {
                rMax = rMax > arr[high] ? rMax : arr[high];
            }

            ans[i] = rMax;
        }

        return ans;
    }
}