package easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target)
    {

        HashMap<Integer,Integer> someMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            //Neu someMap khong chua
            if(!someMap.containsKey(target-nums[i])){
                someMap.put(nums[i],i);
                //System.out.println(someMap);
            }else{
                //return ra mang [gia tri cua somMap.get, va vi tri i]
                return new int[]{someMap.get(target-nums[i]),i};
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSum a = new TwoSum();

        System.out.println(Arrays.toString(a.twoSum(new int[]{1,2, 5, 10}, 6)));
    }
}
