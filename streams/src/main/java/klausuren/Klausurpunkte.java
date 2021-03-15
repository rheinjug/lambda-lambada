package klausuren;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Klausurpunkte {
    /**
     * 1. Aufgabe (es gibt Tests)
     * <p>
     * Diese Funktion soll aus der Datei `punkte.csv` alle Zeilen einlesen und letztlich eine Liste von StudentInnen
     * erzeugen.
     * <p>
     * Nun sollen die folgenden Schritte durchgeführt werden:
     * <p><ol>
     * <li>erzeuge einen Stream
     * <li>wirf die erste Zeile weg
     * <li>teile die Zeilen auf bei einem Komma
     * <li>filtere die Zeilen, deren Länge 3 ist (die anderen haben nicht mitgeschrieben und müssen daher nicht betrachtet werden)
     * <li>erzeuge nun aus der Zeile eine neue Studentin
     * <li>gib das Ergebnis als Liste zurück.
     *
     * @return Liste von StudentInnen
     * @throws IOException Datei könnte nicht vorhanden sein, ist uns hier egal
     */
    List<Studentin> leseStudentinnenAusDatei() throws IOException {
        List<String> zeilen = Files.readAllLines(Paths.get("punkte.csv"));
        return Collections.emptyList();
    }

    /**
     * 2. Aufgabe (es gibt Tests)
     * <p>
     * Bestanden haben diejenigen, die mindestens 50 Punkte in der Klausur haben.
     * <p>
     * Gib die Anzahl der Studierenden aus, die bestanden haben.
     *
     * @param studentInnen Liste von StudentInnen
     * @return Anzahl der StudentInnen, die bestanden haben
     */
    long bestanden(List<Studentin> studentInnen) {
        return 0;
    }

    /**
     * 3. Aufgabe (es gibt Tests)
     * <p>
     * Die durchschnittliche Punktzahl interessiert uns. Gib die durchschnittlich erreichte Punktzahl über beide
     * Klausuren aus.
     *
     * @param studentInnen
     * @return
     */
    double durchschnitt(List<Studentin> studentInnen) {
        return 0;
    }

    static class Studentin {
        private final double punkte;
        private final String name;
        private final String artDerKlausur;

        public Studentin(double punkte, String name, String artDerKlausur) {
            this.punkte = punkte;
            this.name = name;
            this.artDerKlausur = artDerKlausur;
        }

        public double getPunkte() {
            return punkte;
        }
    }
}
