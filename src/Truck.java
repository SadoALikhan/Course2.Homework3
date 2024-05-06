public class Truck extends Transport {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель грузовика");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку грузовика");
    }

    public void check(Truck truck) {
        System.out.println("Обслуживаем " + truck.getModelName());
        for (int a = 0; a < truck.getWheelsCount(); a++) {
                truck.updateTyre();
        }
        truck.checkEngine();
        truck.checkTrailer();
        System.out.println();
    }
}
