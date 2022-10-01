import java.util.*;

class Phone{
    void playMusic(){
        System.out.println("Playing Music from Phone");
    }
    void on(){
        System.out.printf("Phone is turning on");
    }
}

class Smartphone extends Phone{
    void music(){
        System.out.println("Playing music from Smartphone");
    }
    void on(){
        System.out.println("Smartphone is turing on");
    }
}

public class Main{
    public static void main(){
        Phone obj=new Smartphone();
        obj.on();
    }
}
