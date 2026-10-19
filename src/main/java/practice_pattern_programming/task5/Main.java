package practice_pattern_programming.task5;

public class Main {
    static void main() {
        FurnitureFactory furnitureFactory = new ClassicFurnitureFactory();
        furnitureFactory.createChair().sitOn();
        furnitureFactory.createTable().use();
        FurnitureFactory furnitureFactory1 = new ModernFurnitureFactory();
        furnitureFactory1.createTable().use();
        furnitureFactory1.createChair().sitOn();
    }
}
