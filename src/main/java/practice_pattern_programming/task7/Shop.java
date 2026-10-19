package practice_pattern_programming.task7;

public class Shop {
    static void main() {
        Order newOrder = new Order.OrderBuilder()
                .setProduct("Платье белое М")
                .setSale("5$")
                .setPayMethod("card")
                .build();
        System.out.println(newOrder);
    }

}
