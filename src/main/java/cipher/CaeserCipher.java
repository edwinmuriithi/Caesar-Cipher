package cipher;

import java.util.Scanner;

public class CaeserCipher {

    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String pText, int shift){
        pText = pText.toLowerCase();
        String cText = "";
        for(int i = 0; i<pText.length(); i++){
            int charIndex = alphabet.indexOf(pText.charAt(i));
            int shiftIndex = (charIndex + shift) % 26;
            char cipherChar = alphabet.charAt(shiftIndex);
            cText = cText + cipherChar;
        }

        return cText;

    }

    public static String decrypt(String cText, int shift){
        cText = cText.toLowerCase();
        String pText = "";
        for (int i = 0; i<cText.length(); i++){
            int charIndex = alphabet.indexOf(cText.charAt(i));
            int shiftIndex = (charIndex - shift) % 26;
            if (shiftIndex < 0){
                shiftIndex = alphabet.length() + shiftIndex;
            }
            char plainChar = alphabet.charAt(shiftIndex);
            pText = pText + plainChar;
        }

        return pText;
    }

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Message");
        String plainText = sc.nextLine();

        System.out.print("Number to be Shifted");
        int shift = sc.nextInt();

        String cipherText = encrypt(plainText, shift);

        System.out.println("The encrypted message is " + cipherText);

        System.out.println("The decrypted message is" + decrypt(cipherText,shift));


        }
    }
