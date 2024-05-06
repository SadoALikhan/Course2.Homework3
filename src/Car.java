public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }

    @Override
    public void checkTrailer() {
        System.out.println("Прицепа не имеется");
    }

    @Override
    public void checkTransport(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int a = 0; a < transport.getWheelsCount(); a++) {
            transport.updateTyre();
        }
        transport.checkEngine();
        System.out.println();
    }
}