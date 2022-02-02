package A_2;

// TODO ок... допустим это лпатеж, или другими словами корзина, но почему у тебя при создании "корзины"
//  в ней сразу же создается и хлеб с молоком и помидорами? если на сайт зайдешь для онлайн заказа и тебе
//  так в корзину всего напихают интересно будет?)
//  ну и вроде как в корзине обычно список покупок (можно использовать наследование и сделать абстрактный
//  интерфейс "покупка" с ценой и названием, а потом унаследоваться и создать разные товары
public class Payment {
    private final Bread bread = new Bread();
    private final Milk milk = new Milk();
    private final Tomato tomato = new Tomato();

    // TODO почему покупки забрасываются в корзину по имени? и почему метод вроде как "купить" - по логике
    //  должен добавить в корзину элемент, а он вообще непонятно что делает)))
    public void buy(String bread) {
        if (this.bread.productName.equals(bread)) {
            System.out.println("Вы купили: " + this.bread.productName + " за " + this.bread.price + "$");
        }
    }

    // TODO а если хочу только молоко?))
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

    // TODO почему без конструктора? то есть хлеб может быть только один и только с одной ценой?
    //  то же самое про молоко и помидоры
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
