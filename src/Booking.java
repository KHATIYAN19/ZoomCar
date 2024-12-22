
import  java.util.Date;
public class Booking {
    Location l;
    Vehicle v;
    User u;
    Date d;
    Booking(Location l,Vehicle v,User u){

        this.l=l;
        this.v=v;
        this.u=u;
        this.d=new Date();
    }
    public void DisplayBooking(){
        System.out.println(v.getchassicNo()+" "+d+" "+v.price+" "+l.getLocation());
    }


}
