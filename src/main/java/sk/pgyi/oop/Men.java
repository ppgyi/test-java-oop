package sk.pgyi.oop;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Men {

    private String meno;
    private String adresa;
    private double vyska;
    private double vaha;
    private int vek;
    private List<Men> kamarati;

    // Bud dame na vsetko getter a setter alebo pouzijem LOMBOK a on na to na
    // pozadi vytvori aj gettre aj settre aj toString a ine...konstruktory:
    // @AllArgConstructor alebo NoArgsConstructor
    // @Data: toString,getter, setter, hash...aj nejaky konstruktor
}