package practice_pattern_programming.task10;

public class Kilometers implements Distance{
    private final double kilometers;

    public Kilometers(double kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public double getDistance() {
        return kilometers;
    }
}
