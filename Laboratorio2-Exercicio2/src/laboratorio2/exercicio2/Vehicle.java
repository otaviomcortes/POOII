package laboratorio2.exercicio2;

class Vehicle implements IVehicle {
    @Override
    public void start() {
        System.out.println("O veículo está ligado.");
    }

    @Override
    public void drive() {
        System.out.println("O veículo está rodando.");
    }

    @Override
    public void stop() {
        System.out.println("O veículo parou.");
    }
}
