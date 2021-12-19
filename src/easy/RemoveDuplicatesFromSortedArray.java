package easy;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            System.out.println(n);
            if (i == 0 || n > nums[i - 1])
                nums[i++] = n;
        }
        return i;
    }

    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();

        System.out.println(removeDuplicatesFromSortedArray.removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }
}
