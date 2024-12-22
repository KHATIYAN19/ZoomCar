import java.sql.SQLOutput;
import  java.util.*;
public class Payment {
    UUID id;
    int price;
    String mode;

    Payment(int price,String mode){
        this.id=UUID.randomUUID();
        this.price=price;
        this.mode=mode;
        System.out.println("Your Payment successful");
        System.out.println("Payment id: "+id);
        System.out.println("Total price: "+this.price);
        System.out.println("Payment mode :"+this.mode);
    }
}
