class Solution {

    private void reverse(int[] nums ,int start, int end){
            while(start<end){
                int a = nums[start];
                nums[start]=nums[end];
                nums[end]=a;
                start++;
                end--;
            }     
        }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
    
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);     
        
    }
}