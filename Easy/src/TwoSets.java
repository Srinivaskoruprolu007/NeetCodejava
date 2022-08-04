import java.util.Arrays;
import java.util.HashMap;

public class TwoSets {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 13;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> prevMap = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int dif = target - num;
            if(prevMap.containsKey(num)){
                return new int[] {prevMap.get(num),i};
            }
            prevMap.put(dif,i);
        }
        return new int[]{};
    }
}
