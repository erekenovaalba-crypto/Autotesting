package practice_pattern_programming.task7;

public class Order {
    private String product;
    private String sale;

    @Override
    public String toString() {
        return "Order{" +
                "product='" + product + '\'' +
                ", sale='" + sale + '\'' +
                ", payMethod='" + payMethod + '\'' +
                '}';
    }

    private String payMethod;
    public  Order(OrderBuilder builder){
        this.product = builder.product;
        this.sale = builder.sale;
        this.payMethod = builder.payMethod;
    }
    public static class OrderBuilder {
        private String product;
        private String sale;
        private String payMethod;
        public  OrderBuilder setProduct(String product){
            this.product = product;
            return this;
        }
        public OrderBuilder setSale(String sale){
            this.sale = sale;
            return this;
        }
        public  OrderBuilder setPayMethod(String payMethod){
            this.payMethod = payMethod;
            return  this;
        }
        public Order build(){
           return new Order(this);
        }
    }

}
