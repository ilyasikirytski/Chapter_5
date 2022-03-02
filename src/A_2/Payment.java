package A_2;

import java.util.ArrayList;

public class Payment {
    int countOfMoney;
    int totalPrice = 0;
    ArrayList<Product> cart = new ArrayList<>();

    public Payment(int countOfMoney) {
        this.countOfMoney = countOfMoney;
    }

    public void addToCart(Product... namesOfProduct) {
        for (Product product : namesOfProduct) {
            totalPrice += product.getPrice();
            cart.add(product);
            System.out.printf("%s Успешно добавлено в корзину\n", product.getProductName());
        }
    }

    public void buy(int countOfMoney) {
        if (countOfMoney - totalPrice >= 0) {
            System.out.println("Вы купили: ");
            for (Product product : cart) {
                System.out.println(product.getProductName());
                countOfMoney -= product.getPrice();
            }
            System.out.println("За " + totalPrice + " рублей. У вас осталось: " + countOfMoney + " рублей");
        } else {
            System.out.println("Не хватает денег");
        }
    }

    abstract class Product {
        private String productName;
        private int price;

        public String getProductName() {
            return productName;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + productName + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    // TOD почему без конструктора? то есть хлеб может быть только один и только с одной ценой?
    //  то же самое про молоко и помидоры
    public class Bread extends Product {
        private String productName = "bread";
        private int price = 3;

        public Bread() {
            super.productName = this.productName;
            super.price = this.price;
        }
    }

    public class Milk extends Product {
        private String productName = "milk";
        private int price = 9;

        public Milk() {
            super.productName = this.productName;
            super.price = this.price;
        }
    }

    public class Tomato extends Product {
        private String productName = "tomato";
        private int price = 12;

        public Tomato() {
            super.productName = this.productName;
            super.price = this.price;
        }
    }
}
