//  Problem Statement:- Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.
class Solution {
    public int secondLargestElement(int[] nums) {
        if (nums.length == 1){
            return -1;
        }
       int great = nums[0];
       for (int i = 1;i<nums.length;i++){
        if (great < nums[i]){
            great = nums[i];
        }
       }

       int min = nums[0];
       for (int j = 1; j < nums.length;j++){
        if (min > nums[j]){
               min = nums[j];
        }
       }

      for (int k =0;great>min;k++){
        great--;
        for (int l =0; l<nums.length;l++){
        if (nums[l]==great){
        return nums[l];
        }
      }
 
    }
         return -1;
}}