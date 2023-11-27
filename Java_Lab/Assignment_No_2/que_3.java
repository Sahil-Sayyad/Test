/*Define a class Employee having members – id, name, salary. 
  Define default constructor. 
  Create a subclass called Manager with private member bonus. 
  Define methods accept and display in both the classes. 
  Create “n” objects of the Manager class and display the details of the 
  worker having the maximum total salary (salary + bonus). */
  import java.util.*;
  class Employee{
        int id;
        String name;
        double salary;

        Employee(){
            id =0;
            name = "";
            salary = 0.0;
        }
        void accept(){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Employee id : ");
            id = s.nextInt();
            s.nextLine();
            System.out.println("Enter Employee Name : ");
            name = s.nextLine();
            System.out.println("Enter Employee Salary : ");
            salary = s.nextDouble();
        }
        void display(){
            System.out.println("Employee id : " + id);
            System.out.println("Employee Name : " + name);
            System.out.println("Employee Salary : " + salary);
        }
  }
  class Manager extends Employee{
        double bonus;
        Manager(){
            super();
            bonus=0.0;
        }
        void accept(){
            super.accept();
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Manager Bonus : ");
            bonus = s.nextDouble();
        }
        void display(){
            super.display();
            System.out.println("Manager Bonus : " + bonus);
        }
        double getTotalSalary(){
            return salary + bonus;
        }
  }

  public class que_3{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of managers (n)");
        int n = s.nextInt();
        Manager m[] = new Manager[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the details of managers " + (i + 1) + ":");
            m[i] = new Manager();
            m[i].accept();
        }

        Manager mts = m[0];
        for(int i = 1; i < n; i++){
            if(m[i].getTotalSalary() > mts.getTotalSalary()){
                mts = m[i];
            }
        }

        System.out.println("\nDetails of the Manager with Maximum Total salary");
        mts.display();
    }
  }