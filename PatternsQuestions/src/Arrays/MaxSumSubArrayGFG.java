package Arrays;

public class MaxSumSubArrayGFG {
    public static void main(String[] args) {
        System.out.println(maximumSumSubarray(new int[] {100, 200, 300, 400}, 2));
    }

    public static int maximumSumSubarray(int[] arr, int k) {
        // Code here
        int i=0,j=0,max=0;
        int sum=0;
        while(arr.length>j){
            sum=sum+arr[j];
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                max=Math.max(max,sum);
                sum=sum-arr[i];
                i++;
                j++;
            }
        }
        return max;
    }
}
