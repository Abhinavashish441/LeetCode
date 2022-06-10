// { Driver Code Starts
//Initial Template for C++

#include <iostream>
using namespace std;


 // } Driver Code Ends
//User function Template for C++

void reverse_dig(int &a,int &b)
{
   //Add your code here.
   int num=0;
   while(a>0){
       num=10*num+a%10;
       a=a/10;
   }
   a=num;
   int num1=0;
   while(b>0){
       num1=10*num1+b%10;
       b=b/10;
   }
   b=num1;
}
void swap(int &a,int &b)
{
   //Add your code here.
   int temp=b;
   b=a;
   a=temp;
}


// { Driver Code Starts.

int main() 
{
    int t;
    cin>>t;
    while(t--)
    {
        int a, b;
	    cin>>a>>b;
	
	    reverse_dig(a,b);
	    swap(a,b);
	    cout<<a<<" "<<b<<endl;
    }
	return 0;
}  // } Driver Code Ends