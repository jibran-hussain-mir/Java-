import java.util.*;

//class Rectangle{
//    public float length,breadth;
//    public void getLength()
//    {
//        System.out.println("Enter the Length of the rectangle : ");
//        Scanner s = new Scanner(System.in);
//        length = s.nextFloat();
//    }
//
//    public void getBreadth(){
//        System.out.println("Enter the Breadth of the Recangle: ");
//        Scanner a=new Scanner(System.in);
//        breadth= a.nextFloat();
//    }
//
//    public float Area(){
//        return length*breadth;
//    }
//}
//
//public class Main{
//    public static void main(String[] args) {
//        Rectangle r=new Rectangle();
//        r.getLength();
//        r.getBreadth();
//        System.out.println("Area of a Rectangle is : "+r.Area());
//        System.out.println(r.length);
//    }
//}


class Rectangle{
    float length,breadth;
    public Rectangle(float length,float breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public float Area(){
        return length*breadth;
    }
}

public class Main{
    public static void main(String[] args) {
        Rectangle r=new Rectangle(5f,10f);
        System.out.println("Area of a Rectangle is : "+r.Area());
    }
}
