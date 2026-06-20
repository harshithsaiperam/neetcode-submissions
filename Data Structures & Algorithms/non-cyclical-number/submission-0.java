class Solution {
    public boolean isHappy(int n) {
        ArrayList list = new ArrayList<>();
        while (!list.contains(n)) {
            list.add(n);
            if (getSquareSum(n) == 1)
                return true;
            n = getSquareSum(n);

        }
        return false;
    }

    private int getSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
