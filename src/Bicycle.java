public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }

    @Override
    public void checkEngine() {
        System.out.println("Нет двигателя");
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
        System.out.println();
    }
}
