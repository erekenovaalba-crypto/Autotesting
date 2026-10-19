package practice_pattern_programming.task12;

public class SecuritySystem implements TurnOn,TurnOff{

    @Override
    public void turnOn() {
        System.out.println("Безопасность включена!");
    }
    @Override
    public void turnOff() {
        System.out.println("Безопасность отключена!");
    }
}
