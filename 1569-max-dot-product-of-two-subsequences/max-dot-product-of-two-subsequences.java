class Solution {
    static int dp[][];

    public static int call(int nums1[],int nums2[],int i,int j){ 
       
       if(i==nums1.length || j==nums2.length){ 
           dp[i][j]=Integer.MIN_VALUE;
           return dp[i][j];
       }

       if(dp[i][j]!=Integer.MIN_VALUE){ 
           return dp[i][j];
       }
       
       int notTake1=call(nums1,nums2,i+1,j);
       int notTake2=call(nums1,nums2,i,j+1);
       int take=call(nums1,nums2,i+1,j+1);
       take=Math.max(take,0)+(nums1[i]*nums2[j]);
    

       dp[i][j]=Math.max(take,Math.max(notTake1,notTake2));

       return dp[i][j];
         
     

    }

    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        // int max=Math.max(n,m);
        
        dp= new int[n+1][m+1];

        for(int i[]:dp){ 
            Arrays.fill(i,Integer.MIN_VALUE);
        }

        return call(nums1,nums2,0,0);


        
    }
}