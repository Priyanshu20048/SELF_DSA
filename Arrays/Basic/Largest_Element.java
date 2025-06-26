// Problem Statement: Given an array, we have to find the largest element in the array.
class Solution {
    public int largestElement(int[] nums) {
     int great = nums[0];
     for (int i =0;i<nums.length;i++){
        if (great < nums[i]){
            great = nums[i];
        }
     }
     return great;
    }
}

// Optimisation Approach :- Start the loop from nums[1] as you already assign nums[0] to great
