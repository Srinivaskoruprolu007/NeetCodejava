public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {0,1,6,4,5,3};
        System.out.println(missingNum(arr));
    }

    public static int missingNum(int[] n){
        int sum = 0;
        int total = n.length*(n.length+1)/2;
        for (int num:n) {
            sum += num;
        }
        return total-sum;
    }
}
