import java.util.*;
public class User {
    String name;
    int id;
    String license;
    ArrayList<Booking> bookings;
    User(String name,String license,int id){
        bookings=new ArrayList<>();
        this.name=name;
        this.license=license;
        this.id=id;
    }
    public void AllBookings(){
        System.out.println("All Booking of User "+this.name);
        for(Booking b:bookings){
            b.DisplayBooking();
        }
    }
    public void AddBooking(Booking b ){
        bookings.add(b);
    }
    public String getName(){
        return this.name;
    }
    public String getLicense(){
        return this.license;
    }
}
