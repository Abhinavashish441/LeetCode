// { Driver Code Starts
import java.io.*;
import java.util.*;
import java.math.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc=new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		while(t-->0){
		    
		    //taking number of elements
		    int n=sc.nextInt();
		   
		    //calling findCatalan() method
		    System.out.println(new Solution().findCatalan(n));
		}
	}
}// } Driver Code Ends



class Solution
{
    //Function to find the nth catalan number.
    public static BigInteger findCatalan(int n)
    {
        //using BigInteger to calculate large factorials.
        BigInteger b=new BigInteger("1");
        
        //calculating n!
        for(int i=1;i<=n;i++){
            b=b.multiply(BigInteger.valueOf(i));
        }
        
        //calculating n! * n!.
        BigInteger c=b;
        c=c.multiply(b);
        
        BigInteger d=new BigInteger("1");
        
        //calculating (2n)!.
        for(int i=1;i<=2*n;i++){
            d=d.multiply(BigInteger.valueOf(i));
        }
        
        //calculating (2n)! / (n! * n!).
        BigInteger ans=d.divide(c);
        
        //calculating (2n)! / ((n! * n!) * (n+1))
        ans=ans.divide(BigInteger.valueOf(n+1));
        
        //returning the nth catalan number.
        return ans;
    }
}