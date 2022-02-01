// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
	    
	    //reading input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//reading total testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //reading number of eggs and floors
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(inputLine[0]);
		    int k = Integer.parseInt(inputLine[1]);
		    
		    //calling eggDrop() method of class
		    //EggDrop
		    System.out.println(new Solution().eggDrop(n, k));
		}
	}
}


// } Driver Code Ends


class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int eggDrop(int n, int k) 
	{
	    int dp[][]=new int[n+1][k+1];
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=k;j++)
	        {
	            if(i==1)
	            {
	                dp[i][j]=j;
	            }
	            else if(j==1)
	            {
	                dp[i][j]=1;
	            }
	            else
	            {
	                int min=Integer.MAX_VALUE;
	                for(int u=0,l=j-1;l>=0;l--,u++)
	                {
	                    int max=Math.max(dp[i-1][u],dp[i][l]);
	                    min=Math.min(max,min);
	                }
	                dp[i][j]=min+1;
	            }
	        }
	    }
	    return dp[n][k];
	}
}