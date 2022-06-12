// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;


 // } Driver Code Ends
//User function template for JAVA

class Solution
{
    //Function to find the minimum indexed character.
    public static int minIndexChar(String str, String patt)
    {
        // Your code here
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<patt.length();i++){
            hs.add(patt.charAt(i));
        }
        int c=-1;
        for(int i=0;i<str.length();i++){
            if(hs.contains(str.charAt(i))){
                c = i;
                break;
            }
        }
        return c;
    }
}

// { Driver Code Starts.

class GFG {
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t>0)
		{
		    t--;
		    
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int res = new Solution().minIndexChar(s1, s2);
		    System.out.println(res);
		}
	}
}
  // } Driver Code Ends