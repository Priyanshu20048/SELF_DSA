class Solution {
    public int secondSmallestElement(int[] nums) {
      int n = nums.length;
      if(n<2){
        return -1;
      }
      int small = Integer.MAX_VALUE;
      int sec_small = Integer.MAX_VALUE;

      for (int i =0;i<nums.length;i++){
        if (nums[i]<small){
            sec_small = small;
            small = nums[i];
            
        }
        else if (nums[i]<sec_small && nums[i] != small) {
            sec_small = nums[i];
        }
    
      }
          return (sec_small == Integer.MAX_VALUE) ? -1 : sec_small;
    }
}
