package practice_pattern_programming.task10;

public class Miles implements Distance{
    private final double miles;

    public Miles(double miles) {
        this.miles = miles;
    }

    @Override
    public double getDistance() {
        return miles;
    }
}
