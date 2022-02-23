package sk.pgyi.oop;

public class Graduate extends Contact{

    private String academicTitle;

    public Graduate(String firstName, String surname) {
        super(firstName, surname);
        this.academicTitle = "";
    }

    public Graduate(String firstName, String surname, String academicTitle) {
        super(firstName, surname);
        this.academicTitle = academicTitle;
    }

    // Prepisana, "pretazena" metoda - upravena materska metoda
    @Override
    public String akoText() {
        return String.format("%s %s", this.academicTitle, super.akoText());
    }
}
