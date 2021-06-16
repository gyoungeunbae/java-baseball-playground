package study;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringCalcaulatorTest {

    @Test
    void test() {
        // Given
        String input = "2 + 3 * 4 / 2";

        // When
        int actual = StringCalculator.calculator(input);

        // Then
        Assertions.assertEquals(10, actual);
    }
}
