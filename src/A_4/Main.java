/*
Создать класс Зачетная Книжка с внутренним классом,
с помощью объектов которого можно хранить информацию
о сессиях, зачетах, экзаменах.
 */
package A_4;

public class Main {
    public static void main(String[] args) {
        RecordBook recordBook = new RecordBook();
        recordBook.setTest("не сдал");
        recordBook.setExam("сдал");
        recordBook.setSession("сдал");

        recordBook.printHistory();
    }
}
