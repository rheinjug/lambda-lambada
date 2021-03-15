package inventar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InventarTest {
    Inventar inventar;

    @BeforeEach
    void setup() {
        this.inventar = new Inventar();
    }

    @Disabled
    @Test
    void haltbareLebensmittel() {
        List<String> haltbareLebensmittel = inventar.haltbareLebensmittel(inventar.lebensmittel);
        assertThat(haltbareLebensmittel).doesNotContain("Marmelade");
        assertThat(haltbareLebensmittel).hasSize(3);
    }

    @Disabled
    @Test
    void haltbareLebensmittel_leereListe() {
        List<String> haltbareLebensmittel = inventar.haltbareLebensmittel(Collections.emptyList());
        assertThat(haltbareLebensmittel).hasSize(0);
    }
}