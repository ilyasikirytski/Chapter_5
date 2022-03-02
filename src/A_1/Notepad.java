package A_1;

import java.util.ArrayList;

public class Notepad {
    private final ArrayList<Note> notes = new ArrayList<>();

    // TOD и ты инициализируешь его каждый раз в конструкторе, то есть если ты
    //  создашь два объекта то второй перезапишет поле notes у первого
    public Notepad() {
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

    // TOD почему добавляешь не запись сразу, а только поля для нее? зачем ее создавать
    //  внутри метода? получается ты нарушил как минимум два принципа SOLID:
    //  - single responsibility, у тебя метод добавляет запись и знает о том как созать ее
    //  - dependency inversion, ты пробрасываешь поля, а конкретную запись создаешь внутри, вдруг бы ты захотел
    //  создать наследника записи и пробросит сюда
    public void addNote(Note note) {
        notes.add(note);
    }

    // TOD по заданию вроде как просили "внутренний класс", а у тебя вложенный, но не критично,
    //  главное понимать разницу
    public class Note {
        private int dateOfNote;
        private String noteBody;

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
