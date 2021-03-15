package parallel;

import zuruecklehnen.Printer;

import java.util.List;

public class ForEach {

  Printer p;

  public ForEach(Printer p) {
    this.p = p;
  }

  public void forEach(List<Integer> ints) {
    ints.stream()
            .map(e -> e + 1)
            .map(e -> e * e)
            .filter(e -> e % 2 == 0)
            .forEach(p::print);
  }

  public void forEachParallel(List<Integer> ints) {
    // Reparier mich!
    // Ungültig ist .sequential() hinzufügen oder .parallel() entfernen ;)
    ints.stream()
            .parallel()
            .map(e -> e + 1)
            .map(e -> e * e)
            .filter(e -> e % 2 == 0)
            .forEach(p::print);
  }

}
