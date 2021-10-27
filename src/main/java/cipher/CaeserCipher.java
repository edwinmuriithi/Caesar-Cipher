package cipher;


import java.util.Scanner;

public class CaeserCipher {
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