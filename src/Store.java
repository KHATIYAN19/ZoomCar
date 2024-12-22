import java.util.*;

public class Store {
    Location l;
    String city;
    int id;
    List<Vehicle>vehicles;
    Store(Location l,String city,int id){
        vehicles=new ArrayList<>();
        this.id=id;
        this.l=l;
        this.city=city;
    }
    public void addVehicle(Vehicle v){
        vehicles.add(v);
        System.out.println("Vehicle is added to store at location "+l.getLocation());
    }
    public  void removeVehicle(Vehicle v){
        vehicles.remove(v);
        System.out.println("Vehicle is Remove to store at location "+l.getLocation());
    }
    public void displyAllVehicle(){
        System.out.println("All vehicles available at  store -location "+l.getLocation());
        for(Vehicle v:vehicles){
            System.out.println(v.getchassicNo()+" "+v.getPrice()+" "+v.getStatus());
        }
    }
}
