package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums ={2,14,18,22,22};
        System.out.println(containsDuplicateHashMap(nums));
        System.out.println(containsDuplicateHashSet(nums));
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicateHashMap(int[] nums) {
        HashMap<Integer,Integer> resMap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(resMap.containsKey(nums[i])){
                return true;
            }
            resMap.put(nums[i],1);
        }
        return false;
    }

    public static boolean containsDuplicateHashSet(int[] nums) {
        HashSet<Integer> resSet = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(resSet.contains(nums[i])){
                return true;
            }
            resSet.add(nums[i]);
        }
        return false;
    }

    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
