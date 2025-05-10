package Arrays;

public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int res=0;
        if(nums.length==0)
            return res;
        for(int num : nums){
            res = res ^ num;
        }
        return res;
    }
    public static void main(String[] args) {
        int [] nums={4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
