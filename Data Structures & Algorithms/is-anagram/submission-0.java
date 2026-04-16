class Solution {
    public boolean isAnagram(String s, String t) {
        int arr [] = new int [200];
        int sLen = s.length(), tLen = t.length(); 
        if(sLen != tLen)return false;
        int max = Math.max(sLen , tLen  );
        for(int i=0;i<max;i++){
               arr[s.charAt(i)]++;
               arr[t.charAt(i)]--; 
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0)return false;
        }
        return true;
    }
}
