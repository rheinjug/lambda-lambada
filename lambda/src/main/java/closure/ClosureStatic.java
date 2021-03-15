package closure;

import java.util.function.Supplier;

public class ClosureStatic {

  private static String message = "A";

  public static void main(String[] args) {

    Supplier<String> supplier = () -> message;

    System.out.println("1: "+supplier.get());

    // Was passiert, wenn du folgende Zeile einfügst? Warum?
    // message = "B";

    System.out.println("2: "+supplier.get());
  }
}
