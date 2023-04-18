package problem_28_find_the_Index;

import java.util.ArrayList;
import java.util.List;

public class Solution {


    public static void main(String[] args) {

        strStr("aaa", "a");
    }
    public static int strStr(String haystack, String needle) {

        if(!haystack.contains(needle)){
            return -1;
        }

        if(haystack.contains(needle) && haystack.length() == needle.length()){
            return 0;
        }

        String[] stringArr = haystack.split(needle);

        if(stringArr.length < 1){
            return 0;
        }

        return stringArr[0].length();
    }
}
