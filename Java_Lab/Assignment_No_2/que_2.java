/*
 * Create a package named “Series” having three different classes to print
 * series:
 * a. Fibonacci series
 * b. Cube of numbers
 * c. Square of numbers
 * Write a java program to generate “n” terms of the above series. Accpet n from
 * user.
 */
import java.util.*;
import Series.*;
public class que_2{
    public static void main(String args[]){
     Scanner s = new Scanner(System.in);
     int num = s.nextInt();
     fibonacci.fib(num);
     Square.square(num);
     Cube.cube(num);
    }
}

