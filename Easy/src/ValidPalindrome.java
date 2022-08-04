public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "race a car";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s){
        String new_s = s.replaceAll("\\s","").toLowerCase();
        char[] character = new_s.toCharArray();
        int start = 0;
        int end = character.length-1;
        while (start<end){
            if(character[start]!= character[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    //another optimal solution for leet code
    public static boolean isPalin(String s){
        int i = 0;
        int j = s.length()-1;
        while (i < j){
            Character start = s.charAt(i);
            Character end = s.charAt(j);
            //let's check for is that character or not
            if(!Character.isLetterOrDigit(start)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(end)){
                j--;
                continue;
            }
            if(Character.toLowerCase(start) != Character.toLowerCase(end)){
                return false;
            }
            i ++;
            j --;
        }
        return true;
    }
}
