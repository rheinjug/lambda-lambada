package aufwaermen;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LambdasTest {
  Lambdas lambdas;

  @BeforeEach
  void setup() {
    this.lambdas = new Lambdas();
  }

  @Disabled
  @DisplayName("Der Mittelwert der leeren Eingabe ist 0")
  @Test
  void test1() {
    int[] values = {};
    double result = lambdas.mittelwertVonNIntegern(values);
    assertThat(result).isCloseTo(0.0, within(0.001));
  }

  @Disabled
  @DisplayName("Der Mittelwert eines Arrays mit einem Element ist das Element")
  @Test
  void test2() {
    int[] values = {42};
    double result = lambdas.mittelwertVonNIntegern(values);
    assertThat(result).isCloseTo(42.0, within(0.001));
  }

  @Disabled
  @DisplayName("Der Mittelwert von 2 und 4 ist 3")
  @Test
  void test3() {
    int[] values = {4, 2};
    double result = lambdas.mittelwertVonNIntegern(values);
    assertThat(result).isCloseTo(3.0, within(0.001));
  }

  @Disabled
  @DisplayName("Der Mittelwert von 2,3 und 4 ist 3")
  @Test
  void test4() {
    int[] values = {4,3, 2};
    double result = lambdas.mittelwertVonNIntegern(values);
    assertThat(result).isCloseTo(3.0, within(0.001));
  }

 //   @Disabled
    @DisplayName("Der Mittelwert von 3, 78, 70, 65, 73, 29, 1, 55, 68 und 83 ist 52.5")
    @Test
    void test5() {
        int[] values = {3, 78, 70, 65, 73, 29, 1, 55, 68, 83 };
        double result = lambdas.mittelwertVonNIntegern(values);
        assertThat(result).isCloseTo(52.5, within(0.001));
    }




}