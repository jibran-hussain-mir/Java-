import java.util.*;

class Circle{
    float radius;
    public Circle() {
        radius=0;
    }

    public Circle(float r) {
      radius=r;
    }
    public double Area(){
        return 3.14 * radius*radius;
    }
}

public class Main{
    public static void main(String[] args) {
        Circle c=new Circle(1);
        System.out.println(c.Area());
    }
}
