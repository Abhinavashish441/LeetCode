// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            
            String s = read.readLine();
            Solution ob = new Solution();
            System.out.println(ob.maxSubstring(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    int maxSubstring(String s) {
        int x = 0;
        int y = Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0') x++;
            else x--;
            y = Math.max(y,x);
            x = x<0?0:x;
        }
        return y;
    }
}