package practice_pattern_programming.task12;

public class LightingSystem implements TurnOff,TurnOn{
    @Override
    public void turnOff() {
        System.out.println("Свет выключен!");
    }

    @Override
    public void turnOn() {
        System.out.println("Свет включен!");
    }
}
