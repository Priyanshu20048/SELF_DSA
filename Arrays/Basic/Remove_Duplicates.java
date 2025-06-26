// Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once. Return the number of unique elements in the array.

// If the number of unique elements be k, then,

// Change the array nums such that the first k elements of nums contain the unique values in the order that they were present originally.
// The remaining elements, as well as the size of the array does not matter in terms of correctness.

// An array sorted in non-decreasing order is an array where every element to the right of an element is either equal to or greater in value than that element.

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length ;j++){
            if (nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];}            }
        
        return i+1 ;
        
    }
}
