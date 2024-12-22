import java.util.HashMap;

public class BookingSystem {
    HashMap<String,Store>stores;

    BookingSystem(){
        stores=new HashMap<>();
    }
    public void addStore(String  l,Store s){
        stores.put(l,s);
    }
    public void removeStore(String l){
        stores.remove(l);
    }
    public void DisplayVehicles(String l){
        Store curr=stores.get(l);
        curr.displyAllVehicle();
    }
    public void AddVehile(Vehicle v,Store s){
        s.addVehicle(v);
    }
    public void removeVehicle(Vehicle v,Store s){
        s.removeVehicle(v);
    }

    public void Book(Vehicle v,User u,Location l,int days,String paymentMode){
          Booking currBooking=new Booking(l,v,u);
          u.AddBooking(currBooking);
          v.setStatus(Status.Booked);
          int price=v.getPrice();
          Payment p=new Payment(price*days,paymentMode);
         System.out.println(u.getName()+ " Your Booking completed thank you for using ZoomCar");
    }



}
