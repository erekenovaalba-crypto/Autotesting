package practice_pattern_programming.task10;

public class Kilometrs implements Distance{
    private  double kilometers;

    public Kilometrs(double kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public double getDistance() {
        return kilometers;
    }
}
