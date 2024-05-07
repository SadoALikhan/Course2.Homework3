public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }

    @Override
    public void checkTransport(Transport transport) {
        Car car = (Car) transport;
        System.out.println("Обслуживаем " + car.getModelName());
        for (int a = 0; a < car.getWheelsCount(); a++) {
            transport.updateTyre();
        }
        car.checkEngine();
        System.out.println();
    }
}