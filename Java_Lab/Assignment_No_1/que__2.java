/*  Write a java program to Reverse a number . 
    Accept number using command line argument. */

public class que__2{
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        int temp = num;
        int reverseNumber= 0;
        while(temp != 0){
            int digit = temp % 10;
            reverseNumber = reverseNumber * 10 + digit;
            temp /= 10;
        }
        System.out.println("ReverseNumber is : " + reverseNumber);
    }
}