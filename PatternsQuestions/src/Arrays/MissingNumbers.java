package Arrays;

public class MissingNumbers {
    public static int missingNumber(int[] nums){
        int sum=0, n=nums.length;
        for(int i=0;i<n;i++){
            sum+=nums[i]; //sum of numbers present
        }
        int missNumber = n*(n+1)/2; //sum of n numbers
        return missNumber-sum;
    }
    public static void main(String[] args) {
        int [] nums={0,3,1};
        System.out.println(missingNumber(nums));
    }
}
