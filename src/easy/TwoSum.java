package easy;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target)
    {

        int arr[] = new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                    break;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        TwoSum a = new TwoSum();

        System.out.println(Arrays.toString(a.twoSum(new int[]{2, 7, 12, 9}, 9)));
        System.out.println(3424);
    }
}
