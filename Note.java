package ie.tudublin;

public class Note {

    private char note;
    private int duration;

    Note(char note, int duration) {
        this.note = note;
        this.duration = duration;
    }

    Note n = new note();

    public String toString() {
        return note + duration;
    }

}
