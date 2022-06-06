// { Driver Code Starts
#include<bits/stdc++.h> 
using namespace std; 

 // } Driver Code Ends
class Solution{   
public:
    string compareFive(int N){
        // code here 
        if(N==5){
            cout<<"Equal to 5";
        }
        else if(N<5){
            cout<<"Less than 5";
        }
        else{
            cout<<"Greater than 5";
        }
    }
};

// { Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        int N;
        cin >> N;
        Solution ob;
        cout << ob.compareFive(N) << endl;
    }
    return 0; 
} 
  // } Driver Code Ends