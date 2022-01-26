class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum =0;
        int max = Integer.MIN_VALUE;
        if(nums.length==1){
            return nums[0];
        }
        for(int i: nums){
            curr_sum += i;
            max = Math.max(curr_sum,max);
            if(curr_sum<0){
                curr_sum=0;
            }
        }
        return max;
    }
}