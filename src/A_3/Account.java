package A_3;

import java.util.ArrayList;

public class Account {
    private final Withdrawals withdrawals = new Withdrawals();
    private final Payments payments = new Payments();
    private final Receipts receipts = new Receipts();

    public void makeWithdraw(int amountOfPayment) {
        withdrawals.withrawalsHistory.add("Вывод средств на сумму " + amountOfPayment);
        System.out.println("Возьмите ваши: " + amountOfPayment);
    }

    public void makePayment(String purpouse, int amountSum) {
        payments.paymentsHistory.add("Совершение платежа: " + purpouse + " на сумму " + amountSum);
        System.out.println("Платёж совершён!");
    }

    public void makeReceipts(int amountSum) {
        receipts.receiptsHistory.add("Поступление средств на сумму: " + amountSum);
        System.out.println("Платёж поступил!");
    }

    public void printHistory() {
        for (String w : receipts.receiptsHistory) {
            System.out.println(w);
        }
        for (String w : payments.paymentsHistory) {
            System.out.println(w);
        }
        for (String w : withdrawals.withrawalsHistory) {
            System.out.println(w);
        }
    }

    public static class Withdrawals {
        ArrayList<String> withrawalsHistory = new ArrayList<>();
    }

    public static class Payments {
        ArrayList<String> paymentsHistory = new ArrayList<>();
    }

    public static class Receipts {
        ArrayList<String> receiptsHistory = new ArrayList<>();
    }
}
