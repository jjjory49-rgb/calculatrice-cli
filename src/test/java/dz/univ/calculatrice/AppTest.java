package dz.univ.calculatrice;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AppTest {

    @Test
    void applicationShouldRunWithoutErrors() {
        assertDoesNotThrow(() -> App.main(new String[]{}));
    }
}
