package parallel;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static parallel.Reducing.*;
import static org.assertj.core.api.Assertions.assertThat;

class ReducingTest {

  List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

  @Test
  void test_addition() {
    Stream<Integer> sequential = ints.stream();
    Stream<Integer> parallel = ints.stream().parallel();
    assertThat(addieren(parallel)).isEqualTo(addieren(sequential));
  }

  @Test
  void test_subtraktion() {
    Stream<Integer> sequential = ints.stream();
    Stream<Integer> parallel = ints.stream().parallel();
    assertThat(subtrahieren(parallel)).isEqualTo(subtrahieren(sequential));
  }

  @Test
  void test_implcation_fixedinput() {
    List<Boolean> booleans = Arrays.asList(true, true, false, true, true, false);
    Stream<Boolean> sequential = booleans.stream();
    Stream<Boolean> parallel = booleans.stream().parallel();
    assertThat(implication(parallel)).isEqualTo(implication(sequential));
  }

  @Disabled("Einschalten, falls test_implcation_fixedinput nicht fehlschlägt")
  @RepeatedTest(1000)
  void test_implication_generativly() {
    Random r = new Random();
    List<Boolean> booleans = Stream.generate(r::nextBoolean).limit(20).collect(Collectors.toList());

    Stream<Boolean> sequential = booleans.stream();
    Stream<Boolean> parallel = booleans.stream().parallel();

    assertThat(implication(parallel)).isEqualTo(implication(sequential));
  }



}