package prime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class PrimeComperatorTest {

  PrimeComperator comperator = new PrimeComperator();

  @Test
  @DisplayName("Primzahlen werden ensprechend ihrer natürlichen Ordnung sortiert")
  void test_two_primes(){
   assertThat(comperator.compareByPrimeFactor(11,3)).isEqualTo(Integer.compare(11,3));
   assertThat(comperator.compareByPrimeFactor(3,11)).isEqualTo(Integer.compare(3,11));
   assertThat(comperator.compareByPrimeFactor(3,3)).isEqualTo(0);
  }

  @Test
  @DisplayName("Zusammengesetzte Zahlen mit gleichem kleinsten Primfaktor sind gleich")
  void test_two_composites_with_identical_lowest_prime(){
   assertThat(comperator.compareByPrimeFactor(22,44)).isEqualTo(0);
   assertThat(comperator.compareByPrimeFactor(44,22)).isEqualTo(0);
  }

  @Test
  @DisplayName("Zusammengesetzte Zahlen mit gleichem unterschiedlichem Primfaktor sind richtig sortiert")
  void test_two_composites_with_different_lowest_prime(){
   assertThat(comperator.compareByPrimeFactor(22,9)).isEqualTo(-1);
   assertThat(comperator.compareByPrimeFactor(9,22)).isEqualTo(1);
  }

  @Test
  @DisplayName("Zusammengesetzte Zahlen sind gleich ihrem kleinsten Primfaktor")
  void test_a_composite_with_its_lowest_prime(){
   assertThat(comperator.compareByPrimeFactor(5,35)).isEqualTo(0);
   assertThat(comperator.compareByPrimeFactor(35,5)).isEqualTo(0);
  }


}
