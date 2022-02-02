package A_1;

import java.util.ArrayList;

public class Notepad {
    // TODO почему поле статическое?
    private static ArrayList<Notepad.Note> notes;

    // TODO и ты инициализируешь его каждый раз в конструкторе, то есть если ты
    //  создашь два объекта то второй перезапишет поле notes у первого
    public Notepad() {
        notes = new ArrayList<>();
    }

    public void printNotes() {
        for (Note n : notes) {
            System.out.println(n);
        }
    }

    public void printNotes(int dateOfNote) {
        for (Note n : notes) {
            if (n.dateOfNote == dateOfNote) {
                System.out.println(n);
            }
        }
    }

    // TODO почему добавляешь не запись сразу, а только поля для нее? зачем ее создавать
    //  внутри метода? получается ты нарушил как минимум два принципа SOLID:
    //  - single responsibility, у тебя метод добавляет запись и знает о том как созать ее
    //  - dependency inversion, ты пробрасываешь поля, а конкретную запись создаешь внутри, вдруг бы ты захотел
    //  создать наследника записи и пробросит сюда
    public void addNote(int dateOfNote, String noteBody) {
        Note note = new Note(dateOfNote, noteBody);
        notes.add(note);
    }

    // TODO по заданию вроде как просили "внутренний класс", а у тебя вложенный, но не критично,
    //  главное понимать разницу
    public static class Note {
        private final int dateOfNote;
        private final String noteBody;

        public Note(int dateOfNote, String noteBody) {
            this.dateOfNote = dateOfNote;
            this.noteBody = noteBody;
        }

        @Override
        public String toString() {
            return "Note{" +
                    "dateOfNote=" + dateOfNote +
                    ", noteBody='" + noteBody + '\'' +
                    '}';
        }
    }
}
