package cipher;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CaeserCipherTest {

    @Test
    @DisplayName("CaeserCipher Initiates Correctly")
    public void caeserCipher_initiatesCorrectly() {
      CaeserCipherTest caeserCipherTest = new CaeserCipherTest();
        assertFalse(!(caeserCipherTest instanceof CaeserCipher));
    }
}
