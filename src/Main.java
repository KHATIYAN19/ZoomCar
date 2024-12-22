public class Main {
    public static void main(String[] args) {
         Location Banglore=new Location("Bangalore","201310","Near Cubbon Park");
         Location Noida=new Location("Noida","201301","A-21 sector-21 Nodia");
         Location Delhi=new Location("Delhi","201510","A-34 Mukurjee Nagar");

        Store BangloreStore=new Store(Banglore,"Bangalore",1);
        Store NoidaStore=new Store(Noida,"Noida",2);
        Store DelhiStore=new Store(Delhi,"Delhi",3);

        BookingSystem sy=new BookingSystem();
        sy.addStore("Banglore",BangloreStore);
        sy.addStore("Noida",NoidaStore);
        sy.addStore("Delhi",DelhiStore);

        Vehicle v1=new Car("UP12S1602",2000,15000);
        Vehicle v2=new Car("DL12D1221",2200,10);
        Vehicle v3=new Car("MH12S1602",1000,100);
        Vehicle v4=new Car("JK12S1602",21000,15300);
        Vehicle v5=new Car("TL12S1602",20200,11200);
        Vehicle v6=new Car("JAAT12S1602",20050,1300);
        Vehicle v7=new Car("HR12S1602",12000,1400);
        Vehicle v8=new Car("HR12GGS1602",1000,1005);
        Vehicle v9=new Car("AS12S1DDS602",300,1550);
        Vehicle v10=new Car("JK12FGS1602",4000,1064);
        Vehicle v11=new Car("TL12S1602",5600,15040);
        Vehicle v12=new Car("UERT12S1602",2400,1500);
        BangloreStore.addVehicle(v1);
        BangloreStore.addVehicle(v2);
        BangloreStore.addVehicle(v3);
        BangloreStore.addVehicle(v4);

        NoidaStore.addVehicle(v5);
        NoidaStore.addVehicle(v6);
        NoidaStore.addVehicle(v7);

        DelhiStore.addVehicle(v8);
        DelhiStore.addVehicle(v9);
        DelhiStore.addVehicle(v10);
        DelhiStore.addVehicle(v11);
        DelhiStore.addVehicle(v12);

      sy.DisplayVehicles("Noida");
      User Lavi=new User("Lavi","UP134rt54u32i",1);
      User Lavi2=new User("Lavi2","HR184rfdt54u32i",2);
      User Lavi3=new User("Lavi3","HPfgewe134rt54u32i",3);
      sy.Book(v1,Lavi,Banglore,2,"UPI");

      Lavi.AllBookings();
      sy.DisplayVehicles("Banglore");
    }
}