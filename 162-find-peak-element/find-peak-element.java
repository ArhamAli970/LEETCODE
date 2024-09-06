class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(n==1 || nums[0]>nums[1]){return 0;}
        else if(nums[n-1]>nums[n-2]){return n-1;}
        int st=1,end=n-2;
        while(st<=end){
            int mid=(st+end)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){return mid;}
            if(nums[mid]>nums[mid-1]){st=mid+1;}
            else{
                end=mid-1;
            }
        }
return -1;

    }
}