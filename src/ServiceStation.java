public class ServiceStation {

    public void check(Bicycle[] bicycles) {
        for (int i = 0; i < bicycles.length; i++) {
            Bicycle bicycle = bicycles[i];
            System.out.println("Обслуживаем " + bicycle.getModelName());
            for (int a = 0; a < bicycle.getWheelsCount(); a++) {
                bicycle.updateTyre();
            }
            System.out.println();
        }
    }


    public void check(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            Car car = cars[i];
            System.out.println("Обслуживаем " + car.getModelName());
            for (int a = 0; a < car.getWheelsCount(); a++) {
                car.updateTyre();
            }
            car.checkEngine();
            System.out.println();
        }
    }

    public void check(Truck[] trucks) {
        for (int i = 0; i < trucks.length; i++) {
            Truck truck = trucks[i];
            System.out.println("Обслуживаем " + truck.getModelName());
            for (int a = 0; a < truck.getWheelsCount(); a++) {
                truck.updateTyre();
            }
            truck.checkEngine();
            truck.checkTrailer();
            System.out.println();
        }
    }
}
