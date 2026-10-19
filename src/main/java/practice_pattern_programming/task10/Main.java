package practice_pattern_programming.task10;

public class Main {
    public static void main(String[] args) {
        Miles miles = new Miles(10);

        System.out.println("Расстояние в милях: "
                + miles.getDistance());

        Distance kilometers =
                new MilesToKilometersAdapter(miles);

        System.out.printf("Расстояние в километрах: %.2f%n",
                kilometers.getDistance());
    }
}