
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Demo {

  static <A, B> Collection<B> map(Function<A, B> f, Collection<A> c) {
    Collection<B> result = new ArrayList<>();
    for (A a : c) {
      result.add(f.apply(a));
    }
    return result;
  }






}
