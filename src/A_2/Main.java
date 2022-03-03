/*
Создать класс Payment с внутренним классом,
с помощью объектов которого можно сформировать покупку из нескольких товаров
 */
package A_2;

public class Main {
    public static void main(String[] args) {
        int countOfMoney = 15;

        Payment payment = new Payment();
        Payment.Bread bread = payment.new Bread();
        Payment.Milk milk = payment.new Milk();
        Payment.Tomato tomato = payment.new Tomato();

        payment.addToCart(bread, milk);
        payment.buy(countOfMoney);
    }
}
