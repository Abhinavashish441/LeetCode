// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int nthPoint(int n)
    {
        // Code here
        int[] arr = new int[n+1];
        if(n==0) return 0;
        else if(n==1) return 1;
        else if(n==2) return 2;
        else if(n==3) return 3;
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        for(int i = 4;i<n+1;i++){
            arr[i] = (arr[i-1] + arr[i-2])%1000000007;
        }
        return arr[n];
    }
}