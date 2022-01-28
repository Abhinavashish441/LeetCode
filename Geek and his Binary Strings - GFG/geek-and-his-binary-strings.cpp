// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

 // } Driver Code Ends
class Solution{

	public:
	 int prefixStrings(int N)
{
    uint64_t mod = 1e9 + 7;
    uint64_t dp[N + 1];
    dp[0] = 1;
    dp[1] = 1;
    for(int i = 2; i < N+1; i++){
        uint64_t res = 0;
        for(int j = 0; j < i; j++){
            res += (dp[j]*dp[i - j - 1])%mod;
            res %= mod;
        }
        dp[i] = res;
    }
    return dp[N] % mod;
}

};
	

// { Driver Code Starts.
int main() 
{
   
   
   	int t;
    cin >> t;
    while (t--)
    {
       	int n;
       	cin >> n;

       

        Solution ob;
        cout << ob.prefixStrings(n);
	    cout << "\n";
	     
    }
    return 0;
}
  // } Driver Code Ends