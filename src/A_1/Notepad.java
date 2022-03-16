package A_1;

import java.util.ArrayList;

public class Notepad {
    private final ArrayList<Note> notes = new ArrayList<>();

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

    public void addNote(Note note) {
        notes.add(note);
    }

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
