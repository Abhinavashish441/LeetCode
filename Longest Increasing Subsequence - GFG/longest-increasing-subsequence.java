// { Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        
        //taking input using Scanner class
        Scanner sc = new Scanner(System.in);
        
        //taking total testcases
        int t = sc.nextInt();
        while(t > 0){
            
            //taking size of array
            int n = sc.nextInt();
            int array[] = new int[n];
            
            //inserting elements in the array
            for (int i = 0; i < n; ++i)
            {
                array[i] = sc.nextInt();
            }
            
            //creating an object of class Solution
            Solution ob = new Solution();
            
            //calling longestSubsequence() method of class
            //Solution
            System.out.println(ob.longestSubsequence(n,array));
            t--;
        }
    } 
} // } Driver Code Ends




class Solution 
{
    //Function to find length of longest increasing subsequence.
    static int longestSubsequence(int size, int a[])
    {
        int ans[] = new int[size];
       Arrays.fill(ans, 1);
       int max ;
       int temp, i,j;
       for ( i =1; i<size; i++ ){
           max = 0;
           for ( j = 0; j<i; j++){
               if ( a[j] < a[i] ){
                   max = Math.max(1+ans[j], max);
               }
              
               
           }
            if ( max == 0){
                   ans[j] = 1;
               }
               else{
                   ans[j] = max;
               }
       }
       int max1= 0;
       for ( i =0; i<size; i++){
           max1 = Math.max(max1, ans[i]);
       }
       return max1;
    }
} 