// { Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.util.*;
import java.io.*;

  public class validip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            Solution obj = new Solution();

            if (obj.isValid(s))
                System.out.println(1);
            else
                System.out.println(0);
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {

    public boolean isValid(String s) {
        // Write your code here
        
        String[] arr = s.split("\\.");
        if(arr.length!=4) return false;
        if (s.endsWith(".")){
           return false;
       }
        for(String x: arr){
            
            if(x=="") return false;
            try {
               int d = Integer.parseInt(x);
           } catch (NumberFormatException nfe) {
               return false;
           }
            int y = Integer.parseInt(x);
            if (y==0  && x.length()!=1){
               return false;
           }
            if (y!=0 &&  x.startsWith("0")){
               return false;
           }
            if(y<0 || y>255){
                return false;
                
            }
            
        }
        return true;
    }
}