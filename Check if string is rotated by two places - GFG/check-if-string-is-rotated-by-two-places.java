// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		t = sc.nextInt();
		String s12 = sc.nextLine();
		for(int i=0; i<t; i++){
		    String s1 = sc.nextLine();
		    String s2 = sc.nextLine();
		    
		    Solution obj = new Solution();
		    
		    boolean flag = obj.isRotated(s1, s2);
		    
		    if(flag == true) System.out.println("1");
		    else System.out.println("0");
		    
		}
	}
}// } Driver Code Ends


class Solution
{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        String x = str1.substring(2,str1.length());
        String y = str1.substring(0,2);
        String temp = x+y;
        String x1 = str1.substring(str1.length()-2,str1.length());
        String y1 = str1.substring(0,str1.length()-2);
        String temp1 = x1+y1;
        if(temp.equals(str2)){
            return true;
        }
        else if(temp1.equals(str2)){
            return true;
        }
        return false;
    }
    
}