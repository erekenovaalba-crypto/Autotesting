package practice_pattern_programming.task3;

public class BicycleFactory extends TransportFactory{
    @Override
    public Transport createTransport() {
        return new Bicycle();
    }
}
