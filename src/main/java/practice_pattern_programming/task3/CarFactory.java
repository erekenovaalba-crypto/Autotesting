package practice_pattern_programming.task3;

public class CarFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Car();
    }
}
