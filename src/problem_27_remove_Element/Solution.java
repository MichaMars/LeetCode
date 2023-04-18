package problem_27_remove_Element;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    static int[] intArr = {-3,-1,0,2,2,3,3};
    static int val = 2;
    public static void main(String[] args) {
        removeDuplicates(intArr, val);
    }
    public static int removeDuplicates(int[] nums, int val) {
        List<Integer> intList = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                intList.add(nums[i]);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(i < intList.size()){
                nums[i] = intList.get(i);
            }else {
                nums[i] = -1;
            }
        }

        return intList.size();
    }
}
