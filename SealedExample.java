
sealed class Vehicle permits Car, Bike {
    void show() {
        System.out.println("This is a vehicle");
    }
}

final class Car extends Vehicle {
    @Override
    void show() {
        System.out.println("This is a Car  - uses petrol or diesel ");
    }
}

non-sealed class Bike extends Vehicle {
    @Override
    void show() {
        System.out.println("This is a Bike  - uses petrol ");
    }
}

//  Not allowed — Vehicle only permits Car and Bike
// class Bus extends Vehicle {}

public class SealedExample {
    public static void main(String[] args) {
        Vehicle v1 = new Car();   // Parent reference → Child object
        Vehicle v2 = new Bike();

        v1.show();
        v2.show();
    }
}
