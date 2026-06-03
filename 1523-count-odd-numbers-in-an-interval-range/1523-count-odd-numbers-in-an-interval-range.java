class Solution {
    public int countOdds(int low, int high) {
        // If either low or high is odd, the integer division (high - low) / 2 misses one
        return (high - low) / 2 + (low % 2 == 1 || high % 2 == 1 ? 1 : 0);
    }
}