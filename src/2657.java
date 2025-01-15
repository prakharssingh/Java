// optimized
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
// bruteforce
class Solution {
    public int[] findThePrefixCommonArray(int[] a, int[] b) {
        int[] ans = new int[a.length];
        HashMap<Integer, Integer> amap = new HashMap<>();
        HashMap<Integer, Integer> bmap = new HashMap<>();
        int count = 0;
        for(int i = 0; i<a.length ; i++){
            amap.put(a[i],1);
            bmap.put(b[i],1);
            if(a[i]==b[i]){
                count++;
                ans[i]= count;
                continue;
            }
            if(bmap.containsKey(a[i])){
                count++;
            }
            if(amap.containsKey(b[i])){
                count++;
            }
            ans[i]= count;
        }
        return ans;
    }
}
