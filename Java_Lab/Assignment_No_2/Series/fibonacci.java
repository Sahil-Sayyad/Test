package Series;
public class fibonacci{
    public static void fib(int num){

        int a = 0;
        int b = 1;
        int fib = a + b;
        System.out.print("Fib Series"+a);
        System.out.print("Fib Series"+ b);
        for(int i = 1; i <= num; i++){
            System.out.println("Fib Series " + fib);
            fib = a + b;
            a = b;
            b = fib;
        }
    }
}