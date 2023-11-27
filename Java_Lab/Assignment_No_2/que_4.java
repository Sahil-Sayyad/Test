/*Create a package “utility”. 
  Define a class CapitalString under “utility” package which will 
  contain a method to return String with first letter capital. 
  Create a Person class (members – name, city) outside the package. 
  Display the person name with first letter as capital by making use of CapitalString.
*/
import Utility.*;
class Person{
    String name;
    String city;

    Person(String name,String city){
        this.name = name;
        this.city = city;
    }
    void display(){
     String pname = CapitalString.firstLetterCapital(name);
     System.out.println("Person Name with First Letter Capital " + pname);
    }
}

public class que_4{
    public static void main(String args[]){
        Person p = new Person("fffasjhgfa","kamthi");
        p.display();
    }
}