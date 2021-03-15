package prime;

import java.util.Collections;
import java.util.List;

public class PrimeComperator {

  public static void main(String[] args) {
    // Wenn du Java 8 benutzt, musst du das hier umschreiben
    List<Integer> integers = List.of(345, 533, 374, 11, 932, 357);

    PrimeComperator comperator = new PrimeComperator();
    comperator.sortByPrimeNumber(integers);

    integers.forEach(s -> {
      System.out.println(s);
    });
  }

  public void sortByPrimeNumber(List<Integer> input) {
    Collections.sort(input, (a, b) -> compareByPrimeFactor(a, b));
  }


  // Für die Aufgabe ist es nicht wichtig zu verstehen, was genau diese Methode macht!
  public int compareByPrimeFactor(Integer a, Integer b) {
    // Alle Primfaktoren von Nicht-Primzahlen sind kleiner oder gleich der Wurzel einer Zahl.
    // Hier verwenden wir die größere der beiden Wurzeln, um die Schleife abzubrechen.
    for (int i = 2; i <= Math.max(Math.sqrt(a), Math.sqrt(b)); i++) {
      // Testen, ob beide Zahlen durch `i` teilbar sind,
      // dann sind sie gleich bezüglich unseres Vergleichs.
      if (a % i == 0 && b % i == 0) {
        return 0;
      }
      // Ist i ein Primfaktor von a, dann ist a kleiner als b bezüglich unseres Vergleichs.
      if (a % i == 0) {
        return -1;
      }
      // Ist i ein Primfaktor von b, dann ist b kleiner als a bezüglich unseres Vergleichs.
      if (b % i == 0) {
        return 1;
      }
    }
    // Es wurden keine Primfaktoren gefunden, folglich sind a und b Primzahlen
    // und wir können direkt vergleichen
    return a.compareTo(b);
  }
}
