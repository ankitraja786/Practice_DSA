 Subarray Sums Divisible by K

Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]


class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer ,Integer>h = new HashMap<>();
        h.put(0,1);
        int count =0;
        int rsum=0;
        //int rem=0;
        for(int i=0;i<nums.length; i++){
            rsum+=nums[i];
            int rem = rsum%k;
            if(rem<0)rem+=k;
            if(h.containsKey(rem)) {
            count+=h.get(rem);
        }
        h.put(rem, h.getOrDefault(rem,0)+1);  
        }
        return count;
    }
}