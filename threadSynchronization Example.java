import java.util.*;
import java .lang.*;
class  bookTheatreSeats{
    int seats_left=10;
    synchronized void bookSeats(int seats){
        if(seats>seats_left) System.out.println("Seats Cannot be booked.Only "+seats_left+" seats left");
        else{
            System.out.println("Seats are booked Successfully");
            seats_left-=seats;
            System.out.println("Seats left : "+seats_left);
        }
    }
}

public class Main extends Thread{

    static bookTheatreSeats b;
    int seats;
    public void run(){
        b.bookSeats(seats);
    }

    public static void main(String[] args) {
        b=new bookTheatreSeats();
        Main obj1=new Main();
        obj1.seats=7;
        obj1.start();
        Main obj2=new Main();
        obj2.seats=6;
        obj2.start();
    }
}
