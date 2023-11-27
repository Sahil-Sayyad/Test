/* Define a "Point" class having members - x,y(coordinates).
 * Define default constructor and parameterized constructors.
 * Define two subclass " ColorPoint" with member as color and
 * subclass "Point3D" with memeber as z(coordinates).
 * Write display method to display the details of different 
 * types of points.
 * 
 */
class Point{
     int x;
     int y;
     Point(){
        x = 0;
        y = 0;
     }
     Point(int x,int y){
        this.x = x;
        this.y = y;
     }
     void display(){
        System.out.println("Point :  (" + x + " , " + y + ")");
     }

}

class ColorPoint extends Point{
    String color;
    ColorPoint(int x,int y,String color){
        super(x,y);
        this.color=color;
    }
    void display(){
        System.out.println("Colorpoint : (" + x +"," + y + ") , Color : "+ color);
    }
    
}
class Point3D extends Point{
    int z;
    Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }
    void display(){
        System.out.println("Point3D : ("+ x + " , " + y + " , "+ z + ")");
    }
}
public class que_1{
      public static void main(String args[]){
        Point point = new Point(3,4);
        point.display();
        ColorPoint cp = new ColorPoint(2,6,"Red");
        cp.display();
        Point3D pd = new Point3D(1,3,4);
        pd.display();
    }
}