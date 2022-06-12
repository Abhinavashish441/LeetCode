// { Driver Code Starts
import java.util.*;
 
class RLEncoding
{
   public static void main(String[] args) 
   {
 
      Scanner sc = new Scanner(System.in);
    
	  int T = sc.nextInt();
	  sc.nextLine();
	  while(T>0)
	  {
		  
		String str = sc.nextLine();
		
		GfG g = new GfG();
		System.out.println(g.encode(str));
		
      
        T--;
	  }
   }
}

// } Driver Code Ends


class GfG
 {
	String encode(String str)
	{
          //Your code here
          String s = str + '$';
          String ans ="";
          int i=0;
          int c=1;
          while(i<s.length()-1){
              
              
              if(s.charAt(i)==s.charAt(i+1)){
                  c++;
              }
              else{
                  ans+=s.charAt(i)+String.valueOf(c);
                  c=1;
                  
              }
              i++;
              
          }
          return ans;
	}
	
 }