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

    // Toto plati k poznamke nad System.out.println(absolvent);
    @Override
    public String toString() {
        return String.format("Volam sa %s", super.akoText());
    }

    // === ABSTRAKTNE TRIEDY ===
    // ked je abstraktna matka musi byt aj dcera class abstraktna, alebo
    // bude override abstraktnu triedu matky!!! Takze:

    // @Override
    // public String getZnami(){
    //      var builder = new StringBuilder();
    //      builder.append("Moji znami:\n");
    //      for(int i = 0; i < this.friends.length; i++){
    //          builder.append(this.friends[i].akoText());
    //          builder.append("\n");
    //      }
    //      return builder.toString();
    // }
}
