package practice_pattern_programming.task7;

public class Shop {
    static void main() {
        Order newOrder = new Order.OrderBuilder()
                .setProduct("Шоколад а4")
                .setSale("7$")
                .setPayMethod("card")
                .build();
        System.out.println(newOrder);
    }

}
