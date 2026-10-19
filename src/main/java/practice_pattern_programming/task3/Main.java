package practice_pattern_programming.task3;

public class Main {
    static void main() {
        TransportFactory transportFactory1 = new CarFactory();
        transportFactory1.transportDrive();
        TransportFactory transportFactory2 = new BicycleFactory();
        transportFactory2.transportDrive();
    }
}
