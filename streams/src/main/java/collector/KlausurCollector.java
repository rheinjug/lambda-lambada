package collector;

import java.util.HashSet;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class KlausurCollector implements Collector<Klausur,Zwischenergebnis, Ergebnis> {


  @Override
  public Supplier<Zwischenergebnis> supplier() {
    return null;
  }

  @Override
  public BiConsumer<Zwischenergebnis, Klausur> accumulator() {
    return null;
  }

  @Override
  public BinaryOperator<Zwischenergebnis> combiner() {
    return null;
  }

  @Override
  public Function<Zwischenergebnis, Ergebnis> finisher() { return null; }

  @Override
  public Set<Characteristics> characteristics() {
    return new HashSet<>();
  }
}
