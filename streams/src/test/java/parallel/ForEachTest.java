package parallel;

import zuruecklehnen.Printer;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class ForEachTest {

  List<Integer> ints = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
  List<Integer> expected = Arrays.asList(4,16,36,64,100);

  @Test
  void test_sequential() {

    Printer p = mock(Printer.class);
    new ForEach(p).forEach(ints);

    for (Integer i : expected) verify(p).print(i);
  }

  @Test
  void test_parallel() {

    Printer p = mock(Printer.class);

    new ForEach(p).forEachParallel(ints);

    for (Integer i : expected) verify(p).print(i);

  }

  @Test
  void test_sequential_order() {

    Printer p = mock(Printer.class);

    new ForEach(p).forEach(ints);
    InOrder inOrder = Mockito.inOrder(p);

    for (Integer i : expected) inOrder.verify(p).print(i);
  }

  @Test
  void test_parallel_order() {

    Printer p = mock(Printer.class);

    new ForEach(p).forEachParallel(ints);
    InOrder inOrder = Mockito.inOrder(p);

    for (Integer i : expected) inOrder.verify(p).print(i);
  }

}
