class Solution {
    public int[] replaceElements(int[] arr) {
        int rMax = -1;
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = n-1; i>=0; i--) {
            ans[i] = rMax;
            rMax = Math.max(arr[i], rMax);
        }
    return ans;
    }
}