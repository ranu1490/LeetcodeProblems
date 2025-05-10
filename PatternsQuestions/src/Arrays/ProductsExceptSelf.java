package Arrays;

public class ProductsExceptSelf {
    public static void main(String[] args) {
        int [] res = productExceptSelf(new int[]{1, 2, 3, 4}) ;
        for (int result :res){
            System.out.println(result);
        }
    }

    public static int[] productExceptSelf(int[] nums) {
            int len=nums.length;
            int[] res =new int[len];
            int left=1,right=1;
            res[0]=1;
            //left
            for(int i=1;i<len;i++){
                res[i] = left*nums[i-1];
                left=res[i];
            }
            //right
            for(int i=len-1;i>=0;i--){
                res[i] = res[i]*right;
                right = right*nums[i];
            }
            return res;
    }
}
