import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NRowSumTest {

    NRowSum nTest = new NRowSum();

    @Test
    void getInt() {
        assertEquals(3, nTest.getInt(1));
        assertEquals(18, nTest.getInt(2));
        assertEquals(57, nTest.getInt(3));
        assertEquals(132, nTest.getInt(4));
    }
}