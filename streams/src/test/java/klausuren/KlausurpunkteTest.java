package klausuren;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class KlausurpunkteTest {
    Klausurpunkte klausurpunkte;

    @BeforeEach
    void setup() {
        this.klausurpunkte = new Klausurpunkte();
    }

    @Disabled
    @Test
    void leseStudentinnenAusDatei() throws IOException {
        List<Klausurpunkte.Studentin> studentInnen = klausurpunkte.leseStudentinnenAusDatei();
        assertThat(studentInnen).hasSize(334);
    }

    @Disabled
    @Test
    void bestandenHatWer50PunkteHat() throws IOException {
        List<Klausurpunkte.Studentin> studentInnen = klausurpunkte.leseStudentinnenAusDatei();
        Assertions.assertThat(klausurpunkte.bestanden(studentInnen)).isEqualTo(219L);
    }

    @Disabled
    @Test
    void durchschnitt() throws IOException {
        List<Klausurpunkte.Studentin> studentInnen = klausurpunkte.leseStudentinnenAusDatei();
        Assertions.assertThat(klausurpunkte.durchschnitt(studentInnen)).isCloseTo(59.8, within(0.1));
    }
}