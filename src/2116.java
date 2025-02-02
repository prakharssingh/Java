class Solution {
    public boolean canBeValid(String s, String locked) {
        if(s.length()%2==1){
            return false;
        }
        int l = 0, r = 0;
        //left to right traversal
        for(int i = 0 ; i<s.length() ; i++){
            if((s.charAt(i)=='(')||locked.charAt(i)=='0'){
                l++;
            }
            else{
                l--;
            }
            if(l<0){
                return false;
            }
        }
        //right to right traversal
        for(int i = s.length()-1 ; i>0 ; i--){
            if((s.charAt(i)==')')||locked.charAt(i)=='0'){
                r++;
            }
            else{
                r--;
            }
            if(r<0){
                return false;
            }
        }
        return true;
    }
}
