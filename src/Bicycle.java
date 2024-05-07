public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }

    @Override
    public void checkTransport(Transport transport) {
        Bicycle bicycle = (Bicycle) transport;
        System.out.println("Обслуживаем " + bicycle.getModelName());
        for (int a = 0; a < bicycle.getWheelsCount(); a++) {
            bicycle.updateTyre();
        }
        System.out.println();
    }
}
