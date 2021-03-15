package reduce;

import static org.assertj.core.api.Assertions.assertThat;


import java.util.List;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
public class ReduceTest {

  @Disabled
  @Test
  @DisplayName("e->e+1 auf 1,2,3 angewendet gibt 2,3,4")
  void testInc(){
   assertThat(Reduce.map(e->e+1, List.of(1,2,3))).containsExactly(2,3,4);
  }

  @Disabled
  @Test
  @DisplayName("e->e*e auf 1,2,3 angewendet gibt 1,4,9")
  void testSquare(){
   assertThat(Reduce.map(e->e*e, List.of(1,2,3))).containsExactly(1,4,9);
  }



}
