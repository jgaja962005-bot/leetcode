class Solution {
    public boolean isPerfectSquare(int num) {
        // Base case: 1 is a perfect square (1 * 1 = 1)
        if (num == 1) {
            return true;
        }
        
        // Define boundaries using long to prevent integer overflow
        long left = 1;
        long right = num / 2; // The square root of any num > 1 is always <= num/2
        
        while (left <= right) {
            long mid = left + (right - left) / 2;
            long square = mid * mid;
            
            if (square == num) {
                return true; // Found the perfect square root
            } else if (square < num) {
                left = mid + 1; // Look in the upper half
            } else {
                right = mid - 1; // Look in the lower half
            }
        }
        
        return false; // No integer square root found
    }
}