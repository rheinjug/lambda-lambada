package inventar;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Lebensmittel {
    private final String name;

    public Lebensmittel(String name) {
        this.name = name;
    }

    public boolean haltbarkeitNichtUeberschritten() {
        return this.name.length() % 2 == 0;
    }

    public String getName() {
        return name;
    }
}

public class Inventar {
    final List<Lebensmittel> lebensmittel = Arrays.asList(
            new Lebensmittel("Brot"),
            new Lebensmittel("Brot"),
            new Lebensmittel("Butter"),
            new Lebensmittel("Marmelade"),
            new Lebensmittel("Eier")
    );

    /**
     * Diese Funktion soll aus den Lebensmitteln `lebensmittel` einen Stream erzeugen, abgelaufene Lebensmittel
     * herausfiltern und dann den Namen der Lebensmittel in einer Liste zurückgeben. Dabei sollen *keine* Duplikate in
     * der Liste vorkommen.
     * <p>
     * Collectors.toList() kann der Funktion .collect() mitgegeben werden, um aus einem Stream am Ende eine Liste zu
     * erzeugen.
     * <p>
     * Es sollen *nur* Methodenreferenzen an die Higher Order Functions gegeben werden.
     *
     * @param lebensmittel
     * @return Liste der Namen der haltbaren Lebensmittel
     */
    List<String> haltbareLebensmittel(List<Lebensmittel> lebensmittel) {
        return Collections.emptyList();
    }
}
