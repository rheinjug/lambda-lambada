package closure;

import java.util.function.Supplier;

public class ClosureLocals {


  static class StringBox {
    public String message;

    public StringBox(String message) {
      this.message = message;
    }
  }

  public static void main(String[] args) {

    String text = "A";
    Supplier<String> supplier1 = () -> text;

    System.out.println("1: "+supplier1.get());

    // Was passiert, wenn du folgende Zeile einfügst? Warum?
    // text = "B";

    System.out.println("2: "+supplier1.get());

    StringBox box = new StringBox("A");
    Supplier<String> supplier2 = () -> box.message;

    System.out.println("3: "+supplier2.get());
    // Was passiert, wenn du folgende Zeile einfügst? Warum?
    // box = new StringBox("B");

    System.out.println("4: "+supplier2.get());

    // Was passiert, wenn du folgende Zeile einfügst? Warum?
    // box.message = "B";

    System.out.println("5: "+supplier2.get());


  }


}
