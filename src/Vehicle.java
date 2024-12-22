public abstract class Vehicle {
    String chassicNo;
    int price;
    Status status;
    public void setStatus(Status s){
        this.status=s;
    }
    public int getPrice(){
        return  this.price;
    }
    public String getchassicNo(){
        return this.chassicNo;
    }
    public Status getStatus(){
        return  this.status;
    }
}
