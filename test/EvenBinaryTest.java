import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenBinaryTest {
    EvenBinary eTest = new EvenBinary();

    @Test
    void getEvens() {
        System.out.println("\nTesting EvenBinaryTest\n");
        String str1, str2, str3, str4,str5;
        str1 = "0";
        str2 = "1";
        str3 = "101";
        str4 = "10010";
        assertEquals(1, eTest.getEvens(str1));
        assertEquals(0, eTest.getEvens(str2));
        assertEquals(2, eTest.getEvens(str3));
        assertEquals(10, eTest.getEvens(str4));
    }
}