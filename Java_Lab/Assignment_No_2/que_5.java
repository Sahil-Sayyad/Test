/*Define an interface “Operation” which has methods area(),volume().
  Define a constant PI having a value 3.142. 
  Create a class circle (member – radius), cylinder (members – radius, height) which implements 
  this interface. 
  Calculate and display the area and volume. 
*/

interface Operation {
    public void area();

    public void volume();

    double PI = 3.14;
}

class Circle implements Operation {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void area() {
        double area_c = 2 * PI * radius * radius;
        System.out.println("Area of Circle is : " + area_c);
    }

    public void volume() {
        double volume_c = 2 * PI * radius ;
        System.out.println("Volume of Circle is : " + volume_c);
    }

}

class Cylinder implements Operation {
    double radius;
    double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public void area() {
        double area_cy = 2 * PI * radius * height + 2 * PI * radius * radius;
        System.out.println("Area of Cylinder is : " + area_cy);
    }

    public void volume() {
        double volume_cy = PI * radius * radius * height;
        System.out.println("Volume of Cylinder is : " + volume_cy);
    }
}

public class que_5 {
    public static void main(String args[]) {
        Circle c = new Circle(4.2);
        c.area();
        c.volume();
        Cylinder cy = new Cylinder(1.1, 2.1);
        cy.area();
        cy.volume();
    }
}