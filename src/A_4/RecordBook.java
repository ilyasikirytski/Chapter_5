package A_4;

import java.util.ArrayList;

public class RecordBook {
    ArrayList<History> histories = new ArrayList<>();

    public void setSession(String result) {
        histories.add(new Session("Сессия " + result));
        System.out.println("Сессия " + result);
    }

    public void setExam(String result) {
        histories.add(new Exam("Экзамен: " + result));
        System.out.println("Экзамен " + result);
    }

    public void setTest(String result) {
        histories.add(new Test("Зачёт: " + result));
        System.out.println("Зачёт " + result);
    }

    public void printHistory() {
        for (History history : histories) {
            System.out.println("История: " + history);
        }
    }

    public abstract class History {
        private String history;

        public History(String history) {
            this.history = history;
        }

        @Override
        public String toString() {
            return "History{" +
                    "history='" + history + '\'' +
                    '}';
        }
    }

    public class Session extends History {
        public Session(String history) {
            super(history);
        }
    }

    public class Exam extends History {
        public Exam(String history) {
            super(history);
        }
    }

    public class Test extends History {
        public Test(String history) {
            super(history);
        }
    }
}
