package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaeserCipherText {

    @Test
    public void testCipherEncryption() {
        String encrypt = "FRGHGDPQ";
        String plaintText = "CODEDAMN";
        int key = +1;
        String encryptedcipherText = CaeserCipherText.toString(encrypt, key);
        assertEquals("FRGHGDPQ", encrypt);
    }

    @Test
    public void testCipherDecryption() {
        String decryptText = "FRGHGDPQ";
        String plaintText = "CODEDAMN";
        int key = -1;
        String decryption = CaeserCipherText.toString(key,decryptText);
        assertEquals("CODEDAMN", decryption);
    }

};
