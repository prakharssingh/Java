class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] freq = new int[26];
        for(int i=0 ; i<words2.length ; i++){
            int[] tempfreq = new int[26];
            for(int j=0; j<words2[i].length() ;j++){
                tempfreq[words2[i].charAt(j)-'a']++;
            }
            for(int k = 0; k<26 ; k++){
                freq[k] = Math.max(tempfreq[k],freq[k]);
            }
        }
        for(int i = 0; i< words1.length ; i++){
            int[] tempfreq = new int[26];
            for(int j = 0; j<words1[i].length() ; j++){
                tempfreq[words1[i].charAt(j)-'a']++;
            }
            boolean check = true;
            for(int k = 0; k<26 ; k++){
                if(freq[k]>tempfreq[k]){
                    check = false;
                    break;
                }
            }
            if(check){
                ans.add(words1[i]);
            }
        }
        return ans;
    }
}
