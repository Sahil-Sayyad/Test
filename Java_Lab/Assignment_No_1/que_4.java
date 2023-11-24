/*Define a class Mynumber having one private integer data member.
 write default constructor to initialize it to a value. write methods isNegative , isPositive, isOdd, isEven .Use command libne arguments to pass a value to the object and perform the above tests.
*/
class Mynumber{
    private int num;
    
    Mynumber(){
        num=0;
    }
    Mynumber(int num){
        this.num = num;
    }
    void isNegative(){
        if(num < 0){
            System.out.println(" Number is Negative");
        }
    }
    void isPositive(){
        if(num > 0){
            System.out.println(" Number is Positive ");
        }
    }
    
    void isEven(){
        if(num%2==0){
            System.out.println(" Number is Even ");
        }
    }
    void isOdd(){
        if(num%2!= 0){
            System.out.println(" Number is Odd ");
        }
    }
}
public class que_4{
    public static void main(String args[]){
        int num = Integer.parseInt(args[0]);
        Mynumber m = new Mynumber(num);
        m.isNegative();
        m.isPositive();
        m.isEven();
        m.isOdd();
    }
}















