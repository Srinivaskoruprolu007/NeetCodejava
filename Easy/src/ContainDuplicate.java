import java.util.*;

public class ContainDuplicate {
    public static void main(String[] args) {
        int[] arr = {2,4,2,5};
        System.out.println(containsDuplicate(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> uniqueValues = new HashSet<>();
        for (int num : nums) {
            if (uniqueValues.contains(num)) {
                return true;
            }
            uniqueValues.add(num);
        }
        return false;
    }
}
