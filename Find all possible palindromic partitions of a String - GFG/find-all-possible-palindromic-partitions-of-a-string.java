// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            ArrayList<ArrayList<String>> allPart = ob.allPalindromicPerms(S);
            
            for (int i=0; i<allPart.size(); i++)  
            { 
                for (int j=0; j<allPart.get(i).size(); j++) 
                { 
                    System.out.print(allPart.get(i).get(j) + " "); 
                } 
                System.out.println(); 
            } 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static ArrayList<ArrayList<String>> allPalindromicPerms(String S) {
        // code here
        ArrayList<ArrayList<String>> res=new ArrayList<>();
        ArrayList<String> list=new ArrayList<>();
        func(0,S,list,res);
        
        return res;
    }
    
    static void func(int ind,String s,ArrayList<String> list,ArrayList<ArrayList<String>> res){
        // Base Case
        if(ind==s.length()){
            res.add(new ArrayList<>(list));
            return ;
        }
        
        // Recursive
        for(int i=ind;i < s.length();i++){
            if(isPalindrome(s,ind,i)){
                list.add(s.substring(ind,i+1));
                func(i+1,s,list,res);
                list.remove(list.size()-1);
            }
        }
    }
    
    static boolean isPalindrome(String s,int start,int end){
        
        while(start<=end){
            if(s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }
};