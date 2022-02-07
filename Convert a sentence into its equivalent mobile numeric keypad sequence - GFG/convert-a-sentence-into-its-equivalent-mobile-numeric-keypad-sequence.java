// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0){
            String S = read.readLine();
            Solution obj = new Solution();
            System.out.println(obj.printSequence(S));
            
        }
    } 
} // } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    String str[] = {"2","22","222",
                        "3","33","333",
                        "4","44","444",
                        "5","55","555",
                        "6","66","666",
                        "7","77","777","7777",
                        "8","88","888",
                        "9","99","999","9999"
                    };
    String printSequence(String input) 
    { 
         String output = "";
        int n = input.length();
        for (int i = 0; i < n; i++)
        {
            if (input.charAt(i) == ' ')
                output = output + "0";
     
            else
            {
                int position = input.charAt(i) - 'A';
                output = output + str[position];
            }
        }
     
        
        return output;
    }
}