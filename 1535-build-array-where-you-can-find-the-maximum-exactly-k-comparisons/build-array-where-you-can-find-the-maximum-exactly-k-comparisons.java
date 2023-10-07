class Solution {
    static long dp[][][];
    static int mod=1000000007;
    public static long call(int n,int m,int k,int i,int max,int sc){ 
        if(i==n && sc==k) {return 1;}
        if(i==n || sc>k){return 0;}

        if(dp[i][max][sc]!=-1){return dp[i][max][sc];}
        long totCnt=0;
        
        for(int l=1; l<=max;l++){ 
             totCnt=((totCnt+call(n,m,k,i+1,max,sc))%mod);
        }

        for(int l=max+1;l<=m;l++){ 
             totCnt=((totCnt+call(n,m,k,i+1,l,sc+1))%mod);
        }
        
        dp[i][max][sc]=totCnt;
        return dp[i][max][sc];
    }
    public int numOfArrays(int n, int m, int k) {
        dp= new long[n+1][m+1][k+1];

        for(int i=0;i<n+1;i++){ 
            for(int j=0;j<m+1;j++){ 
                for(int l=0;l<k+1;l++){ 
                    dp[i][j][l]=-1;
                }
            }
        }

long tot=0;
for(int i=1;i<=m;i++){
    tot=(tot+call(n,m,k,1,i,1))%mod;
    // System.out.print(tot);
}

return (int)(tot%mod);

    }
}