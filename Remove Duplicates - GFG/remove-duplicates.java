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
            String result = ob.removeDups(s);
            
            System.out.println(result);
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    String removeDups(String S) {
        // code here
        int n= S.length();
        String ans = "";
        for(int i=n-1;i>=0;i--){
            char ch = S.charAt(i);
            int index = S.indexOf(ch);
            if(index<i){
                continue;
            }
            else{
                ans=ch+ans;
            }
        }
        return ans;
    }
}