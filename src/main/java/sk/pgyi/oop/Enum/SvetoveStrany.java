package sk.pgyi.oop.Enum;

public enum SvetoveStrany {
    SEVER,
    JUH,
    VYCHOD,
    ZAPAD

    // Enum moze mat vlastne metody vlastne premenne, atributy, konstruktor
    // boolean jeSever;
    // SvetoveStrany(boolean jeSever){
    //      this.jeSever = jeSever;
    // }
    // --- ale potom musi byt takto:
    // SEVER(true),
    // JUH(false), ... lebo SEVER() --- je sa o sebe instancia!!

    // Priklad metody:
    // static SvetoveStrany fromString(String s){
    //      return SvetoveStrany.valueOf(s.toUpperCase(Locale.ROOT));
    // }
}
