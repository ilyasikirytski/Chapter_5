package A_4;

import java.util.ArrayList;

// TODO абсолютно идентичен логике в RecordBook, смысл то же
public class RecordBook {

    private final RecordBook.Session session = new RecordBook.Session();
    private final RecordBook.Exam exam = new RecordBook.Exam();
    private final RecordBook.Test test = new RecordBook.Test();

    public void setSession(String result) {
        session.sessionHistory.add("Сессия " + result);
        System.out.println("Сессия " + result);
    }

    public void setExam(String result) {
        exam.examHistory.add("Экзамен: " + result);
        System.out.println("Экзамен " + result);
    }

    public void setTest(String result) {
        test.testHistory.add("Зачёт: " + result);
        System.out.println("Зачёт " + result);
    }

    public void printHistory() {
        for (String w : session.sessionHistory) {
            System.out.println("История: " + w);
        }
        for (String w : exam.examHistory) {
            System.out.println("История: " + w);
        }
        for (String w : test.testHistory) {
            System.out.println("История : " + w);
        }
    }

    public static class Session {
        ArrayList<String> sessionHistory = new ArrayList<>();
    }

    public static class Exam {
        ArrayList<String> examHistory = new ArrayList<>();
    }

    public static class Test {
        ArrayList<String> testHistory = new ArrayList<>();
    }
}
