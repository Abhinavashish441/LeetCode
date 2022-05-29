/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l =1;
        int m=n;
        int ans = -1;
        while(l<=m){
            int mid = l+(m-l)/2;
            if(isBadVersion(mid)){
                ans = mid;
                m = mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}