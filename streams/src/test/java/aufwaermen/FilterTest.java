package aufwaermen;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class FilterTest {
    Filter myfilter;

    @BeforeEach
    void setup() {
        this.myfilter = new Filter();
    }

    @Disabled
    @Test
    void summeGeradeZahlen_10Stream_gibt30() {
        assertThat(myfilter.summeGeradeZahlen(10)).isEqualTo(30);
    }

    @Disabled
    @Test
    void summeGeradeZahlen_100Stream_gibt30() {
        assertThat(myfilter.summeGeradeZahlen(100)).isEqualTo(2550);
    }
}