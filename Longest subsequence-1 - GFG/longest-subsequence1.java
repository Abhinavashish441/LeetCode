// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int A[]= new int[N];
            for(int i = 0; i < N; i++)
                A[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.longestSubsequence(N, A));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int longestSubsequence(int N, int A[])
    {
         int dp[]=new int[N];
       for(int  i = 0 ;  i < N ; i ++)
       {
           dp[i] = 1;
       }
       
       
       
       for(int  i = 0 ; i  < N ; i ++)
       {
           for(int j = 0 ; j  < i ; j ++)
           {
               if(Math.abs(A[i]-A[j]) == 1)
               dp[i] = Math.max(dp[i] , dp[j] + 1);
           }
       }
       
       int ans = 0;
  
  for(int x : dp) ans = Math.max(ans , x);
  
  return ans;
    }
}