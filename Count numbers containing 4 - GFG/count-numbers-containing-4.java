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
            int N = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            System.out.println(ob.countNumberswith4(N));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static int countNumberswith4(int N) {
        // code here
        int[] arr = new int[N+1];
        int i=1;
        Arrays.fill(arr,0);
        int ans=0;
        while(i<N+1){
            if(check(i)){
                arr[i] = 1;
                ans++;
            }
            i++;
        }
        
        return ans;
        
    }
    static boolean check(int i){
        if(i==0) return false;
        while(i>0){
            int x= i%10;
            if(x==4){ return true;
            }
            i/=10;
        }
        return false;
    }
};