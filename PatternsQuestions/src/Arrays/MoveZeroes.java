package Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums.length<=1)
                break;
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,2,0,7,0,5,6});
    }
}
