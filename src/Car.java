public class Car extends Transport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель машины");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку машины");
    }

    public void check(Car car) {
        System.out.println("Обслуживаем " + car.getModelName());
        for (int a = 0; a < car.getWheelsCount(); a++) {
            car.updateTyre();
        }
        car.checkEngine();
        System.out.println();
    }
}