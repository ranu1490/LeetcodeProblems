package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicates {
    public static void main(String[] args) {
        List<Integer> nums = findDuplicates(new int[]{2,3,4,3,4,6,5});
        System.out.println(nums);
        System.out.println(findDuplicatesNum(new int[]{2,3,4,3,4,5,6}));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int arr[] = new int[nums.length+1];
        List<Integer> res = new ArrayList<>();
        for(int num:nums){
            arr[num]+=1;
            if(arr[num]==2){
                res.add(num);
            }
        }
        return res;
    }

    public static List<Integer> findDuplicatesNum(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int num:nums){
            int freq = map.getOrDefault(num,0);
            freq++;
            if(freq==2){
                res.add(num);
            }
            map.put(num,freq);
        }
        return res;
    }
}
