class Solution {
    public int lengthOfLastWord(String s) {
       int l = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                l++;
            }
            else{
                if(l>0) return l;
            }
        }
        return l;
    }
}