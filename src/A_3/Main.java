/*
Создать класс Account с внутренним классом,
с помощью объектов которого можно хранить информацию обо всех операциях со счетом
(снятие, платежи, поступления).
 */
package A_3;

public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.makeReceipts(250);
        account.makePayment("За комуналку", 200);
        account.makeWithdraw(30);
        System.out.println(" ");

        account.printHistory();

    }
}
