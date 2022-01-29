// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} // } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        for(int j=1; j<m; j++){
            for(int i=0; i<n; i++){
                if(i == 0){
                    if(n == 1)
                        M[i][j] += M[i][j-1];
                    else
                        M[i][j] += Math.max(M[i][j-1], M[i+1][j-1]);
                }
                else if(i == n-1)
                    M[i][j] += Math.max(M[i][j-1], M[i-1][j-1]);
                else
                    M[i][j] += Math.max(M[i][j-1],Math.max(M[i+1][j-1], M[i-1][j-1]) );
            }
        }
        int ans = 0;
        for(int k = 0;k<n;k++){
            ans = Math.max(ans,M[k][m-1]);
        }
        return ans;
    }
}