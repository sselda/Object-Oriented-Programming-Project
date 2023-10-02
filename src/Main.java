import java.sql.SQLSyntaxErrorException;

public class Main {
    public static void main(String[] args) {

        //Create 3 classes
        //Describe the relationship between 3 classes
        //Define the variables chassisType, model, mileage, price and door
        //Create the carDriver method. With this method, increase the km of the car with the given value and print a text to the console.
        //All classes should have constructors and all or some of the variables should be defined in constructors.
        //Determine the selling price of the car by creating a method called salesPrice.
        //Create 2 different vehicles in the main class, drive these vehicles and update their prices.

        Sedan sedanCoupe = new Sedan("Opel",10000,50000, 5);
        System.out.println("My car model = " + " " + sedanCoupe.getModel() + " " + "Usage of km =" + " " + sedanCoupe.getKm() + " " + "My car price = " + " " + sedanCoupe.getPrice() + " " + "Door = " + sedanCoupe.getDoor());

        sedanCoupe.carDrive(60000);
        sedanCoupe.salePrice(40000);
        System.out.println("My car model = " + " " + sedanCoupe.getModel() + " " + "Usage of km =" + " " + sedanCoupe.getKm() + " " + "My car price = " + " " + sedanCoupe.getPrice() + " " + "Door = " + sedanCoupe.getDoor());

        sedanCoupe.carDrive(15000);
        sedanCoupe.salePrice(35000);
        System.out.println("My car model = " + " " + sedanCoupe.getModel() + " " + "Usage of km =" + " " + sedanCoupe.getKm() + " " + "My car price = " + " " + sedanCoupe.getPrice() + " " + "Door = " + sedanCoupe.getDoor());

        Volvo VolvoXC90 = new Volvo("XC90", 0,100000,5);
        VolvoXC90.carDrive(20000);
        VolvoXC90.salePrice(95000);

        System.out.println("My car Model = " + " " + VolvoXC90.getModel() + " " + "Usage of km = " + " " + VolvoXC90.getKm() + " " + "My car price = " +  " " + VolvoXC90.getPrice() + " " + "Door = " + VolvoXC90.getDoor());
        }


    }
