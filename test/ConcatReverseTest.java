import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConcatReverseTest {

    ConcatReverse ctest = new ConcatReverse();

    @org.junit.jupiter.api.Test
    void reverseString() {
        String str1 = "";
        String str2 = "a";
        String str3 = "Hello There";
        String res1 = ctest.reverseString(str1);
        String res2 = ctest.reverseString(str2);
        String res3 = ctest.reverseString(str3);
        assertEquals("",res1, "Should handle empty strings");
        assertEquals("a",res2, "Should handle strings with single char");
        assertEquals("erehT olleH", res3, "Should handle multi-char strings with Spaces");

    }

    @org.junit.jupiter.api.Test
    void splitString() {
        String str1 = "";
        String str2 = "a";
        String str3 = "Hello There";
        String str4 = "abc123";
        String[] res1, res2, res3, res4;
        res1 = ctest.splitString(str1);
        res2 = ctest.splitString(str2);
        res3 = ctest.splitString(str3);
        res4 = ctest.splitString(str4);
        assertEquals("",res1[0]);
        assertEquals("a",res2[0]);
        assertEquals("Hello",res3[0]);
        assertEquals(" There",res3[1]);
        assertEquals("abc", res4[0]);
        assertEquals("123", res4[1]);
    }

    @Test
    void runRevCon() {
        System.out.println("\nTesting the Reverse Concatenate Method...\n");
        String str1 = "";
        String str2 = "a";
        String str3 = "abc123";
        String str4 = "Hello There";
        String res1, res2, res3, res4;
        res1 = ctest.runRevCon(str1);
        res2 = ctest.runRevCon(str2);
        res3 = ctest.runRevCon(str3);
        res4 = ctest.runRevCon(str4);
        assertEquals("", res1);
        assertEquals("a", res2);
        assertEquals("cba321", res3);
        assertEquals("olleHerehT ", res4);
    }
}