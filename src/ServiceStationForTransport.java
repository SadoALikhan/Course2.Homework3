public class ServiceStationForTransport implements ServiceStation {
    @Override
    public void check(Bicycle[] bicycles) {
        for (int i = 0; i < bicycles.length; i++) {
            Bicycle bicycle = bicycles[i];
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int a = 0; a < bicycle.getWheelsCount(); a++) {
                System.out.println(bicycle.updateTyre() + " номер " + (a + 1));
            }
            System.out.println();
        }
    }

    @Override
    public void check(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("Обслуживаем " + car.getModelName());
            for (int a = 0; a < car.getWheelsCount(); a++) {
                System.out.println(car.updateTyre() + " номер " + (a + 1));
            }
            car.checkEngine();
            System.out.println();
        }
    }

    @Override
    public void check(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            Truck truck = trucks[i];
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int a = 0; a < truck.getWheelsCount(); a++) {
                System.out.println(truck.updateTyre() + " номер " + (a + 1));
            }
            truck.checkEngine();
            truck.checkTrailer();
            System.out.println();
        }
    }
}
