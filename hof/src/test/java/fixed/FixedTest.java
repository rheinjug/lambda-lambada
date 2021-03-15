package fixed;

import fixed.Fixed;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class FixedTest {

@Disabled
@Test
@DisplayName("Wurzel 4.0 ist ~ 2.0")
void test1(){
 assertThat(Fixed.heron(4.0)).isCloseTo(2.0, Offset.offset(1e-4));
}

@Disabled
@Test
@DisplayName("Wurzel 2.0 ist das selbe, das Math.sqrt berechnet")
void test2(){
 assertThat(Fixed.heron(2.0)).isCloseTo(Math.sqrt(2.0), Offset.offset(1e-4));
}



}
