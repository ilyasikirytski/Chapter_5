package A_3;

import java.util.ArrayList;

public class Account {
    ArrayList<Operations> histories = new ArrayList<>();

    public void makeWithdraw(int amountOfPayment) {
        histories.add(new Withdrawals("Вывод средств на сумму " + amountOfPayment));
        System.out.println("Возьмите ваши: " + amountOfPayment);
    }

    public void makePayment(String purpouse, int amountSum) {
        histories.add(new Payments("Совершение платежа: " + purpouse + " на сумму " + amountSum));
        System.out.println("Платёж совершён!");
    }

    public void makeReceipts(int amountSum) {
        histories.add(new Receipts("Поступление средств на сумму: " + amountSum));
        System.out.println("Платёж поступил!");
    }

    public void printHistory() {
        for (Operations operations : histories) {
            System.out.println(operations);
        }
    }

    public abstract class Operations {
        private final String operationHistory;

        public Operations(String operationHistory) {
            this.operationHistory = operationHistory;
        }

        @Override
        public String toString() {
            return "Operations{" +
                    "history='" + operationHistory + '\'' +
                    '}';
        }
    }

    public class Withdrawals extends Operations {
        public Withdrawals(String operationHistory) {
            super(operationHistory);
        }
    }

    public class Payments extends Operations {
        public Payments(String operationHistory) {
            super(operationHistory);
        }
    }

    public class Receipts extends Operations {
        public Receipts(String operationHistory) {
            super(operationHistory);
        }
    }
}
