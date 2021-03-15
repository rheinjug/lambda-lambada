package collector;

import java.util.stream.Stream;

public class Ergebnis {

  private double min, max, avg;
  private int bestanden;


  public Ergebnis(Zwischenergebnis zwischenergebnis) {
    if (zwischenergebnis.getCount() != 0) {
      this.min = zwischenergebnis.getMin();
      this.max = zwischenergebnis.getMax();
      this.avg = zwischenergebnis.getSum() / zwischenergebnis.getCount();
      this.bestanden = zwischenergebnis.getBestanden();
    }
  }

  public double getMin() {
    return min;
  }

  public double getMax() {
    return max;
  }

  public double getAvg() {
    return avg;
  }

  public int getBestanden() {
    return bestanden;
  }

  @Override
  public String toString() {
    return "Ergebnis{" +
            "min=" + min +
            ", max=" + max +
            ", avg=" + avg +
            ", bestanden=" + bestanden +
            '}';
  }
}
