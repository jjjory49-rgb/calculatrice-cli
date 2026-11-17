package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SubtractOperationTest {

    private final SubtractOperation operation = new SubtractOperation();

    @Test
    void shouldSubtractTwoPositiveNumbers() {
        assertEquals(2.0, operation.execute(5.0, 3.0), 0.0001);
    }

    @Test
    void shouldSubtractNegativeAndPositiveNumbers() {
        assertEquals(-5.0, operation.execute(-2.0, 3.0), 0.0001);
    }

    @Test
    void shouldSubtractDecimalNumbers() {
        assertEquals(1.5, operation.execute(3.75, 2.25), 0.0001);
    }

    @Test
    void shouldReturnZeroWhenSubtractingEqualNumbers() {
        assertEquals(0.0, operation.execute(5.0, 5.0), 0.0001);
    }
}
