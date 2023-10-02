public class Car {

    private String chassisType;
    private String model;
    private int km;
    private int price;
    private int door;

    public Car(String chassisType, String model, int km, int price, int door){
        this.chassisType = chassisType;
        this.model = model;
        this.km = km;
        this.price = price;
        this.door = door;

    }

    public String getChassisType() {
        return chassisType;
    }

    public String getModel() {
        return model;
    }

    public int getKm() {
        return km;
    }

    public int getPrice() {
        return price;
    }

    public int getDoor() {
        return door;
    }

    public void carDrive(int driveKm){
        this.km += driveKm;
        System.out.println("Car new km" + this.km);
    }

    public int salePrice(int newSalePrice){
        return this.price = newSalePrice;
    }
}
