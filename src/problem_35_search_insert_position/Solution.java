package problem_35_search_insert_position;

public class Solution {
   static int[] nums = {1,3,5,6};
   static int target = 7;

    public static void main(String[] args) {
        System.out.println(searchInsert(nums, target));
    }
    public static int searchInsert(int[] nums, int target) {
        int result = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(target > nums[nums.length - 1]){
                return nums.length;
            }else if(nums[i] < target && nums[i+1] > target){
                return i+1;
            }
        }

        return 0;
    }
}
