import java.io.*;
public class que_1{
    public static void main(String args[]) throws IOException{
        System.out.println("Enter  number ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        
        for(int i = 1; i <= 10 ; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}