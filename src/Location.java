public class Location {
    String location;
    String pincode;
    String address;
    Location(String location,String pincode,String address){
        this.location=location;
        this.pincode=pincode;
        this.address=address;
    }

    public String getPincode() {
        return pincode;
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }
}
