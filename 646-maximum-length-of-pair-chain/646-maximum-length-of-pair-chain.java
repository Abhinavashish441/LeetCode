class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->a[1]-b[1]);
        int i=0;
        int count=0;
        int n = pairs.length;
        while(i<n){
            count++;
            int curr = pairs[i][1];
            while(i<n && pairs[i][0]<=curr) i++;
            
        }
        return count;
        
    }
}