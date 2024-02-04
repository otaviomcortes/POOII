package laboratorio2.exercicio2;

public class Main {
    public static void main(String[] args) {
        IVehicleMaker vehicleMaker = VehicleFactory.getInstance();

        IVehicle corolla = vehicleMaker.makeVehicle("Corolla");
        IVehicle hilux = vehicleMaker.makeVehicle("Hilux");
        IVehicle city = vehicleMaker.makeVehicle("City");


        corolla.start();
        corolla.drive();
        corolla.stop();

        hilux.start();
        hilux.drive();
        hilux.stop();

        city.start();
        city.drive();
        city.stop();
    }
}

