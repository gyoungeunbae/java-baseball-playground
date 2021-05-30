package study;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    void split() {
        String string = "1,2";
        String actual[] = string.split(",");
        assertThat(actual).containsExactly("1", "2");
    }

    @Test
    void subString() {
        String string = "(1,2)";
        String actual = string.substring(1,4);
        assertThat(actual).isEqualTo("1,2");
    }

    
}
