interface Vehicle {
    void deliver();
}

class Truck implements Vehicle {
    public void deliver() {
        System.out.println("Грузовик доставляет по дороге");
    }
}

class Ship implements Vehicle {
    public void deliver() {
        System.out.println("Корабль доставляет по морю");
    }
}

class Airplane implements Vehicle {
    public void deliver() {
        System.out.println("Самолет доставляет по воздуху");
    }
}

class Logistics {
    public static Vehicle initializeVehicle(String type) {
        switch(type) {
            case "truck":
                return new Truck();
            case "ship":
                return new Ship();
            case "airplane":
                return new Airplane();
            default:
                System.out.println("Неправильный тип (" + type + ")");
                return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle truck = Logistics.initializeVehicle("truck");
        truck.deliver();

        Vehicle ship = Logistics.initializeVehicle("ship");
        ship.deliver();

        Vehicle airplane = Logistics.initializeVehicle("airplane");
        airplane.deliver();
    }
}
