class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = null;
        for(int i=n-1;i>=0;i--){
            for(int j=i;j<n;j++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && (j-i<3||dp[i+1][j-1]);
                
                if(dp[i][j] && (ans == null || j-i+1>ans.length())){
                    ans = s.substring(i,j+1);
                }
            }
        }
        return ans;
    }
}