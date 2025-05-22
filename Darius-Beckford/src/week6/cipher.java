package week6;

public class cipher {
    public static void main(String[] args) {
        String message = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String encryptedMessage = encrypt(message, 3);
        String decryptedMessage = decrypt(encryptedMessage, 3);

        System.out.println("Original message: " + message);
        System.out.println("Encrypted message: " + encryptedMessage);
        System.out.println("Decrypted message: " + decryptedMessage);
    }

    public static String encrypt(String message, int shift) {
        StringBuilder encrypted = new StringBuilder();

        for (char c: message.toCharArray()) {
            char nextChar = ' ';
            if (c >= 'X' && c <= 'Z') {
                nextChar = (char) (c + (shift - 26));
            } else if (c >= 'A' && c <= 'W') {
                nextChar = (char) (c + shift);
            }
            encrypted.append(nextChar);
        }
        return encrypted.toString();
    }

    public static String decrypt(String message, int shift) {
        StringBuilder decrypted = new StringBuilder();

        for (char c : message.toCharArray()) {
            char nextChar = ' ';
            if (c >= 'A' && c <= 'C') {
                nextChar = (char) (c + (shift + 20));
            } else if (c >= 'D' && c <= 'Z') {
                nextChar = (char) (c - shift);
            }
            decrypted.append(nextChar);
        }
        return decrypted.toString();
    }
}
