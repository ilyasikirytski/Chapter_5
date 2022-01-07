/*
Создать класс Payment с внутренним классом,
с помощью объектов которого можно сформировать покупку из нескольких товаров
 */
package A_2;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment();
        payment.buy("bread", "milk", "tomato");

    }
}
