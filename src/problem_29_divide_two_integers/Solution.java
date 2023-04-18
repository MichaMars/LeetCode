package problem_29_divide_two_integers;

public class Solution {
    static int val1 = -11;
    static int val2 = 2;


    public static void main(String[] args) {
        divide(val1,val2);
    }
    public static int divide(int dividend, int divisor) {
        int count = 0;
        int val1 = dividend;
        int val2 = divisor;

        if(val1 > 0) {
            while (val1 >= val2) {
                val1 = val1 - val2;
                count++;
            }
        }
        if(val1 < 0){
            while (val1 <= val2) {
                val1 = val1 + val2;
                count++;
            }
        }


        System.out.println(count);
        return count;
    }
}
