package cipher;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class CaeserCipherTest {

    @Test
    @DisplayName("CaeserCipher Initiates Correctly")
    void main() {
      CaeserCipherTest caeserCipherTest = new CaeserCipherTest();
        assertFalse(!(caeserCipherTest instanceof CaeserCipher));
    }
}