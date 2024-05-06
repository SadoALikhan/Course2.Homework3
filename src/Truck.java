public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void checkTransport(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int a = 0; a < transport.getWheelsCount(); a++) {
                transport.updateTyre();
        }
        transport.checkEngine();
        transport.checkTrailer();
        System.out.println();
    }
}
