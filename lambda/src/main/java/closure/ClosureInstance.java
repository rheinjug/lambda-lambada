package closure;

import java.util.function.Supplier;

public class ClosureInstance {

  private String message = "A";

  private void print() {
    Supplier<String> supplier = () -> this.message;

    System.out.println("1: "+supplier.get());

    // Was passiert, wenn du folgende Zeile einfügst? Warum?
    // message = "B";

    System.out.println("2: "+supplier.get());



  }

  public static void main(String[] args) {
    new ClosureInstance().print();
  }



}
