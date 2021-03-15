package golf;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PresidentialGolfingTest {

  @Test
  void bestPlayer() {

    PresidentialGolfing mapMutation = new PresidentialGolfing();
    mapMutation.addResult("Barack H. Obama", 3,3,2,4,6,2,1,4,3);
    mapMutation.addResult("Donald J. Trump", 13,13,12,14,9,12,7,5,6);

    assertThat(mapMutation.bestPlayer()).isEqualTo("Barack H. Obama");
    assertThat(mapMutation.getResult(0).getStrokes()).containsExactly(3,3,2,4,6,2,1,4,3);

  }
}