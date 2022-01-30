// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        //reading input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //reading total testcases
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading length of line segment
            int n = Integer.parseInt(read.readLine().trim());
            
            
            //reading 3 segment lengths
            String str[] = read.readLine().trim().split(" ");
            
            int x = Integer.parseInt(str[0]);
            int y = Integer.parseInt(str[1]);
            int z = Integer.parseInt(str[2]);
            
            
            //calling method maximizeCuts() of class Solution()
            //and printinting the result
            System.out.println(new Solution().maximizeCuts(n, x, y, z));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution
{
    //Function to find the maximum number of cuts.
    int[] dp = new int[10005];
    public int maximizeCuts(int n, int x, int y, int z)
    {
       Arrays.fill(dp,-1);
       int ans = func(n,x,y,z);
       return ans<0?0:ans;
    }
    public int func(int n, int x, int y, int z){
        if(n==0) return 0;
        if(dp[n]!=-1) return dp[n];
        int p1 = Integer.MIN_VALUE;
        int p2 = Integer.MIN_VALUE;
        int p3 = Integer.MIN_VALUE;
        
        if(n>=x) p1 = func(n-x,x,y,z);
        if(n>=y) p2 = func(n-y,x,y,z);
        if(n>=z) p3 = func(n-z,x,y,z);
        return dp[n] = 1 + Math.max(p1,Math.max(p2,p3));
    }
}
