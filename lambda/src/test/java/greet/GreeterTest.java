package greet;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class GreeterTest {

  @Test
  // Beispiel
  void test0() {
    Greeter greeter = (Integer n)  -> { return "Hallo Welt!"; };
    assertThat(greeter.greet(1)).isEqualTo("Hallo Welt!");
  }


  @Disabled
  @Test
  // Versuche den Lambda-Ausdruck möglichst minimal aufzuschreiben
  void test1() {
    Greeter greeter = null;
    assertThat(greeter.greet(1)).isEqualTo("Hallo Javaland!");
  }

  @Disabled
  @Test
  void test2() {
    Greeter greeter = null;
    assertThat(greeter.greet(3)).isEqualTo("Hallo Javaland! Hallo Javaland! Hallo Javaland!");
  }

  @Disabled
  @Test
  void test3() {
    Greeter greeter = null;
    assertThat(greeter.greet(5)).isEqualTo(".....");
  }

  @Disabled
  @Test
  void test4() {
    Greeter greeter = null;
    assertThat(greeter.greet(5)).isEqualTo("*****");
  }

  @Disabled
  @Test
    // Verwende eines der Interfaces, die in Java enthalten sind
    // Der Lambda Ausdruck ist exakt der Gleiche wie in test1
  void test5() {
    // << ??? >> greeter = << exakt der gleiche Ausdruck wie in test1>>;
    // assertThat(greeter.<< ??? >>(1)).isEqualTo("Hallo Javaland!");
  }

}
