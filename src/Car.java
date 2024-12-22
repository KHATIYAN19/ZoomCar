public class Car extends   Vehicle{
       int distance;
       Car(String chassicNo,int price,int distance){
           this.chassicNo=chassicNo;
           this.distance=distance;
           this.price=price;
           this.status=Status.NotBooked;
       }
       public void BookCar(){
           this.status=Status.Booked;
       }
}
