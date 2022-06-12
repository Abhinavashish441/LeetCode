// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String roman = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(roman));
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    HashMap<Character,Integer> map = new HashMap<>();
    void hashmap(){
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }
    public int romanToDecimal(String str) {
        // code here
        hashmap();
        int ans = 0;
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length-1;i++){
            if(map.get(ch[i])>=map.get(ch[i+1])){
                ans+=map.get(ch[i]);
            }
            else{
                ans+=map.get(ch[i])*-1;
            }
        }
        ans+=map.get(ch[ch.length-1]);
        return ans;
        
    }
}