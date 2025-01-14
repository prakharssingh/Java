    class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int[] ans = new int[a.length];
        HashSet<Integer> seen = new HashSet<>();
        int count = 0;
        for(int i = 0; i<a.length ; i++){
            if(seen.contains(a[i])){
                count++;
            }
            else{
                seen.add(a[i]);
            }
            if(seen.contains(b[i])){
                count++;
            }
            else{
                seen.add(b[i]);
            }
            ans[i]= count;
        }
        return ans;
    }
}
