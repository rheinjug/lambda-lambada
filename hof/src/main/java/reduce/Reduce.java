package reduce;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Reduce {

  static <A, E> A reduce(A init, BiFunction<A, E, A> rf, Collection<E> c) {
    A akku = init;
    for (E e : c) {
      akku = rf.apply(akku, e);
    }
    return akku;
  }


  static <A, B> Collection<B> map(Function<A, B> f, Collection<A> c) {
    // Implementiere map mit Hilfe von reduce.
    // return reduce(init, rf, c);
    return null;
  }

  public static void main(String[] args) {
    map(e->e+1, List.of(1,2,3)).forEach(System.out::println);
  }


}
