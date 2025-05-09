package app.entity;

public class User {
    private String name;
    private Address address;

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public void setAddress(String streetName, String buildingNumber){
       this.address = new Address(streetName, buildingNumber);
    }
    public Address getAddress(){
        return address;
    }

    @Override
    public String toString() {
        return "User - "+ name + ", lives at the address: ";
    }
}
