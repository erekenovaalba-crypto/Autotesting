package practice_pattern_programming.task3;

public abstract class TransportFactory {
    public abstract Transport createTransport();
    public void transportDrive(){
        Transport transport = createTransport();
        System.out.println("Транспорт создан");
        transport.drive();
    }
}
