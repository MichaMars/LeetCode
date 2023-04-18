package problem_26_remove_duplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.stream.Collectors;

public class Solution {
    static int[] intArr = {-3,-1,0,0,0,3,3};
    public static void main(String[] args) {
        removeDuplicates(intArr);
    }
    public static int removeDuplicates(int[] nums) {

        Set<Integer> intSet = new HashSet<Integer>() {
        };
        for(int i : nums){
            intSet.add(i);
        }
        ArrayList<Integer> intList = (ArrayList<Integer>)intSet.stream().sorted().collect(Collectors.toList());

        System.out.println(intList);
        for (int i = 0; i < nums.length; i++) {
            if(i < intList.size()){
                nums[i] = intList.get(i);
            }else {
                nums[i] = -1;
            }
        }

        return intSet.size();
    }
}
