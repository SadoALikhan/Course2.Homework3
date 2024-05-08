public class Bicycle extends Transport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку велосипеда");
    }

    @Override
    public void checkTransport() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int a = 0; a < this.getWheelsCount(); a++) {
            this.updateTyre();
        }
        System.out.println();
    }
}
