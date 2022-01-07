/*
Создать класс Notepad с внутренним классом или классами,
с помощью объектов которого могут храниться несколько записей на одну дату
 */

package A_1;

public class Main {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.addNote(1, "one");
        notepad.addNote(1, "second");
        notepad.addNote(2, "two");
        notepad.addNote(3, "three");
        notepad.addNote(4, "four");


        notepad.printNotes();
    }
}
