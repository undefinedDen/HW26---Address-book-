package app.entity;

public class Address {
    private String streetName;
    /// Переменная buildingNumber имеет тип String с предположением,
    ///  что номер дома может быть написан через "/", к примеру "22/24"
    private String buildingNumber;

    public Address(String streetName, String buildingNumber) {
    this.streetName = streetName;
    this.buildingNumber = buildingNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    @Override
    public String toString() {
        return streetName +" , " +  buildingNumber ;
    }
}
