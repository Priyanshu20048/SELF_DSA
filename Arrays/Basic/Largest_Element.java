// Problem Statement: Given an array, we have to find the largest element in the array.
// My Approach 
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

// Brute Force :- Sort the array in ascending order and print the last lement of arr

// Optimisation Approach :- Start the loop from nums[1] as you already assign nums[0] to great
