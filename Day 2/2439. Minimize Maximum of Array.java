class Solution {
    public int minimizeArrayValue(int[] nums) {
        long sum = 0, max = 0;
		for (int i = 0; i < nums.length; i++) {
			max = Math.max(max, ((sum += nums[i]) + i) / (i + 1));
		}
		return (int) max;
    }
}