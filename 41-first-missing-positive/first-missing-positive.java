class Solution {
    public int firstMissingPositive(int[] nums) {
int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0){
                nums[i]=n+10;
            }
        }

        for(int i=0;i<n;i++){
            if(Math.abs(nums[i])<=n && nums[Math.abs(nums[i])-1]>0){
                nums[Math.abs(nums[i])-1]=0-nums[Math.abs(nums[i])-1];
            }
        }

        for(int i=0;i<n;i++){
            if(nums[i]>0){return i+1;}
        }
        
        return n+1;
        
    }
}