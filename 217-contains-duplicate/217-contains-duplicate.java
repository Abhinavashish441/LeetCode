class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        for(int i:nums){
            if(!hs.containsKey(i)){
                hs.put(i,1);
            }
            else{
                return true;
            }
        }
        return false;
    }
}