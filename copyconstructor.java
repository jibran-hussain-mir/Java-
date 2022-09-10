import java.util.*;

class Student{
    int id;
    String name;

    public Student(){
        id=1;
        name="jibran";
        System.out.println(id+" " +name);

    }

    public Student(Student obj){
        id=obj.id;
        name=obj.name;
        System.out.println(id+" " +name);
    }
}

public class Main{
    public static void main(String[] args) {
        Student obj1=new Student();
        Student obj2=new Student(obj1);
        obj1.id=2;
        System.out.println(obj1.id);
        System.out.println(obj2.id);



    }
}
