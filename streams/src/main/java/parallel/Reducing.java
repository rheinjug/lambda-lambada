package parallel;

import java.util.stream.Stream;

public class Reducing {

  public static Integer addieren(Stream<Integer> integerStream) {
    return integerStream
            .reduce(100, (a, e) -> a + e);
  }

  public static Integer subtrahieren(Stream<Integer> integerStream) {
    return integerStream
            .reduce(0, (a, e) -> a - e);
  }

  public static Boolean implication(Stream<Boolean> booleans) {
    return booleans.reduce(true, Reducing::implies, Reducing::implies);
  }


  private static boolean implies(boolean a, boolean b) {
    return !a || b;
  }



}
