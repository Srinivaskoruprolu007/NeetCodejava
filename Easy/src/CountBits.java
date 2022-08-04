import java.util.Arrays;

public class CountBits {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(Arrays.toString(countBits(num)));
    }

    public static int[] countBits(int num){
        int[] ans = new int[num+1];
        for (int i = 0; i <= num ; i++) {
            ans[i] =  count(i);
        }
        return ans;
    }

    private static int count(int i) {
        int count = 0;
        while (i != 0){
            i &= i - 1;
            count++;
        }
        return count;
    }
}
