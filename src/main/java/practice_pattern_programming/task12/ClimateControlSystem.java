package practice_pattern_programming.task12;

public class ClimateControlSystem implements TurnOn,TurnOff{
    @Override
    public void turnOff() {
        System.out.println("Кондиционер выключен!");
    }

    @Override
    public void turnOn() {
        System.out.println("Кондиционер включен!");
    }
}
