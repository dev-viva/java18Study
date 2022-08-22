package junit5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MathUtilsTests {
    @Test
    @DisplayName("Test successful decimal conversion")
    void testConvertToDecimalSuccess() {
        double result = MathUtils.convertToDecimal(3, 4);
        Assertions.assertEquals(0.75, result);
    }
    @Test
    void testConvertToDecimalInvalidDenominator(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> MathUtils.convertToDecimal(3, 0));
    }
}
