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
    public void checkTransport() {
        System.out.println("Обслуживаем " + this.getModelName());
        for (int a = 0; a < this.getWheelsCount(); a++) {
                this.updateTyre();
        }
        this.checkEngine();
        this.checkTrailer();
        System.out.println();
    }
}
