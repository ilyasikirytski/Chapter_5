package A_2;

import java.util.ArrayList;

public class Payment {
    private int totalPrice = 0;
    private final ArrayList<Product> cart = new ArrayList<>();

    public Payment() {
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

    public abstract class Product {
        private String productName;
        private int price;

        public String getProductName() {
            return productName;
        }

        public int getPrice() {
            return price;
        }
    }

    public class Bread extends Product {
        public Bread() {
            super.productName = "bread";
            super.price = 3;
        }
    }

    public class Milk extends Product {
        public Milk() {
            super.productName = "milk";
            super.price = 9;
        }
    }

    public class Tomato extends Product {
        public Tomato() {
            super.productName = "tomato";
            super.price = 12;
        }
    }
}
