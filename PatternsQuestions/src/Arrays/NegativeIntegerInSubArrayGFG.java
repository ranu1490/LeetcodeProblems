package Arrays;

import java.util.ArrayList;
import java.util.List;

public class NegativeIntegerInSubArrayGFG {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        int i=0,j=0;
        List<Integer> ll = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        while(arr.length>j){
            if(arr[j]<0){
                ll.add(arr[j]);
            }
            if(j-i+1<k){
                j++;
            }else if(j-i+1==k){
                if(ll.isEmpty()){
                    res.add(0);
                }else{
                    res.add(ll.get(0));
                    if(arr[i]==ll.get(0))
                        ll.remove(ll.get(0));
                }
                i++;
                j++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(firstNegInt(new int[]{-8, 2, 3, -6, 10},2));
    }
}
