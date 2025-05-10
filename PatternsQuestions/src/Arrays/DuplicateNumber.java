package Arrays;

public class DuplicateNumber {
    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length;) {
            if (nums[i] == i) {
                i++;
                continue;
            }
            if (nums[nums[i]] == nums[i])
                return nums[i];
            swap(nums, i, nums[i]);
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[] {2,1,4,5,1,6}));
    }
}
