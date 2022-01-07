package A_2;

public class Payment {
    private final Bread bread = new Bread();
    private final Milk milk = new Milk();
    private final Tomato tomato = new Tomato();

    public void buy(String bread) {
        if (this.bread.productName.equals(bread)) {
            System.out.println("Вы купили: " + this.bread.productName + " за " + this.bread.price + "$");
        }
    }

    public void buy(String bread, String milk) {
        if (this.bread.productName.equals(bread) && this.milk.productName.equals(milk)) {
            int price = this.bread.price + this.milk.price;
            System.out.println("Вы купили: " + this.bread.productName + " и " + this.milk.productName +
                    " за " + price + "$");
        }
    }

    public void buy(String bread, String milk, String tomato) {
        if (this.bread.productName.equals(bread) && this.milk.productName.equals(milk) && this.tomato.productName.equals(tomato)) {
            int price = this.bread.price + this.milk.price + this.tomato.price;
            System.out.println("Вы купили: " + this.bread.productName + " и " + this.milk.productName +
                    " за " + price + "$");
        }
    }


    public static class Bread {
        String productName = "bread";
        int price = 5;

        @Override
        public String toString() {
            return "Bread{" +
                    "productName='" + productName + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static class Milk {
        String productName = "milk";
        int price = 9;

        @Override
        public String toString() {
            return "Milk{" +
                    "productName='" + productName + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static class Tomato {
        String productName = "tomato";
        int price = 12;

        @Override
        public String toString() {
            return "Tomato{" +
                    "productName='" + productName + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
