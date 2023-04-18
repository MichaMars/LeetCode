package problem_58_length_last_word;

public class Solution {

    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        s.trim();
        String[] strArr = s.split(" ");
        return strArr[strArr.length-1].length();

       
    }
}
