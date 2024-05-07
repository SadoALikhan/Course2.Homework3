public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {

        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {

        System.out.println("Меняем покрышку грузовика");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void checkTransport(Transport transport) {
        Truck truck = (Truck) transport;
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int a = 0; a < truck.getWheelsCount(); a++) {
                truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
        System.out.println();
    }
}
