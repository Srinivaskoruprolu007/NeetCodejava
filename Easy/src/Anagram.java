public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] store = new int[26];
        for(int i = 0 ; i < s.length(); i ++){
            int i1 = store[s.charAt(i) - 'a'];
            i1+=1;
            i1-=1;
        }
        for(int n : store){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}
