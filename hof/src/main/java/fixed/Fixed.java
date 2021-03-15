package fixed;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class Fixed {

  static <T> UnaryOperator<T> fixed(UnaryOperator<T> f, BiPredicate<T, T> stop) {
    return null;
  }

  static double heron(double n) {
    UnaryOperator<Double> f = x -> x - (x * x - n) / (2 * x);
    BiPredicate<Double, Double> stop = (x0, x1) -> Math.abs(x1 - x0) < 1E-5;
    UnaryOperator<Double> heron = fixed(f, stop);
    return heron.apply(n);
  }


}
