import java.util.HashMap;
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character ,Integer> mpp1 = new HashMap<>();
        HashMap<Character,Integer> mpp2 = new HashMap<>();

        for(char c : s.toCharArray()){
            mpp1.put(c,mpp1.getOrDefault(c,0) + 1);
        }

        for(char c : t.toCharArray()){
            mpp2.put(c,mpp2.getOrDefault(c,0) + 1);
        }

        return mpp1.equals(mpp2);
    }
}
