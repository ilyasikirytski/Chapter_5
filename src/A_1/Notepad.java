package A_1;

import java.util.ArrayList;

public class Notepad {
    private static ArrayList<Notepad.Note> notes;

    public Notepad() {
        notes = new ArrayList<>();
    }

    public void printNotes(){
        for (Note n : notes) {
            System.out.println(n);
        }
    }

    public void printNotes(int dateOfNote){
        for (Note n : notes){
            if (n.dateOfNote == dateOfNote){
                System.out.println(n);
            }
        }
    }

    public void addNote(int dateOfNote, String noteBody) {
        Note note = new Note(dateOfNote, noteBody);
        notes.add(note);
    }

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
