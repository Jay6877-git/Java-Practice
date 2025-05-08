/**
 * Class to check if one number is a multiple of another
 * @author Jay Patel
 */
public class JavaBasicPractice {
    /**
     * Checks if num1 is a multiple of num2.
     * 
     * @param num1 Number
     * @param num2 Number assumed to be multiple of num1
     * @return true if num2 is a multiple of num1
     */
    public static boolean isMultiple(long num1, long num2){
        boolean value;
        value = num1 % num2 == 0;
        return value;
    };
    
    /**
     * Checks if i is even or not
     * 
     * @param i number to checked for being even
     * @return true if i is even number
     */
    public static boolean isEven(int i){
        boolean isEven;
        isEven = i % 2 == 0;
        return isEven;
    }
    
    /**
     * Returns sum of all the positive integer less than or 
     * equal to given number
     * 
     * @param i positive integer
     * @return sum of all integer less than or equal to i
     */
    public static int sumUpTo(int i){
        if(i < 0){
            return 0;
        }
        return i * (i + 1) / 2;
    }
    
    /**
     * Returns sum of all odd positive integer less than or
     * equal to given number
     * 
     * @param i positive integer
     * @return sum of all odd integer less than or equal to i
     */
    public static int sumOfOddUpTo(int i){
        if(i < 0){
            return 0;
        }
        int count = (i + 1) / 2;
        return count * count;
    }
    
    /**
     * Returns sum of square of positive integer less than or
     * equal to given number
     * @param i positive integer
     * @return sum of square of all integer less than or equal to i
     */
    public static int sumOfSquareUpTo(int i){
        if(i < 0){
            return 0;
        }
        return i * (i + 1) * (2 * i + 1) / 6;
    }
}
