class Solution {
    public void reverseString(char[] s) {
        int l = 0;
        int m = s.length-1;
        while(l<m){
            swap(l,m,s);
            l++;
            m--;
        }
    }
    public void swap(int l,int m,char[] s){
        char x = s[l];
        s[l] = s[m];
        s[m] = x;
        
    }
}