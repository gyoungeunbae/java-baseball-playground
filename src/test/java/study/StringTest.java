package study;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @Test
    void charAt() {
        String string = "abc";
        char actual1 = string.charAt(1);
        assertThat(actual1).isEqualTo('b');
        assertThatThrownBy(() -> {
            string.charAt(4);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 4");
    }
}
