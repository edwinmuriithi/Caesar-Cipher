package cipher;

import java.util.Scanner;

public class CaeserCipher {

    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String pText, int Key){
        pText = pText.toLowerCase();
        String cText = "";
        for(int i = 0; i<pText.length(); i++){
            int charIndex = alphabet.indexOf(pText.charAt(i));
            int newIndex = (charIndex + Key) % 26;
            char cipherChar = alphabet.charAt(newIndex);
            cText = cText + cipherChar;
        }

        return cText;

    }

    public static String decrypt(String cText, int Key){
        cText = cText.toLowerCase();
        String pText = "";
        for (int i = 0; i<cText.length(); i++){
            int charIndex = alphabet.indexOf(cText.charAt(i));
            int newIndex = (charIndex - Key) % 26;
            if (newIndex < 0){
                newIndex = alphabet.length() + newIndex;
            }
            char plainChar = alphabet.charAt(newIndex);
            pText = pText + plainChar;
        }


        return pText;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Message");
        String plaintext = sc.nextLine();
        System.out.println("Number to be shifted");
        int shift = sc.nextInt();
        String ciphertext = "";
        char alphabet;
        for (int i = 0; i < plaintext.length(); i++) {
            alphabet = plaintext.charAt(i);
            if (alphabet >= 'a' && alphabet >= 'z') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'z') {
                    alphabet = (char) (alphabet + 'a' - 'z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            } else if (alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + shift);
                if (alphabet > 'Z'){
                    alphabet = (char) (alphabet + 'A' - 'Z' - 1);
                }
                ciphertext = ciphertext + alphabet;
            }
            else{
                ciphertext = ciphertext + alphabet;
            }
            System.out.println("Cipher text " + ciphertext);
        }
    }
}