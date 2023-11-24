/* Write a java program to print the sum of elements of the Array. 
   Also display array elements in ascending order.
*/
import java.util.*;
public class que_3{
    public static void main(String args[]){
        int arr[] = {1,23,4,5,5,66,6773,2,3,87};
        int sum = 0;
        
        for(int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        System.out.println("sum of elements of array is : " + sum);
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}