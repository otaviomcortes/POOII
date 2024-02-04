package laboratorio2.exercicio2;

class VehicleFactory implements IVehicleMaker {
    private static VehicleFactory instance;

    // Construtor privado para evitar instanciação direta
    private VehicleFactory() {}

    // Método estático para obter a instância única da fábrica
    public static synchronized VehicleFactory getInstance() {
        if (instance == null) {
            instance = new VehicleFactory();
        }
        return instance;
    }

    // Método para criar instâncias de veículos com base no modelo
    @Override
    public IVehicle makeVehicle(String model) {
        switch (model.toLowerCase()) {
            case "corolla" -> {
                return new Corolla();
            }
            case "hilux" -> {
                return new Hilux();
            }
            case "etios" -> {
                return new Etios();
            }
            case "city" -> {
                return new City();
            }
            case "civic" -> {
                return new Civic();
            }
            case "fit" -> {
                return new Fit();
            }
            default -> throw new IllegalArgumentException("Modelo de veículo desconhecido: " + model);
        }
    }
}