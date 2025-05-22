package week6;

public class CaesarCipher implements BaseCipher {
    private int shift;

    public CaesarCipher(int shift) {
        this.shift = shift;
    }

    @Override
    public String encrypt(String message) {
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

    @Override
    public String decrypt(String message) {
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

    public static void main(String [] args) {
        CaesarCipher ccipher = new CaesarCipher(3);

        String message = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String encrypted = ccipher.encrypt(message);
        String decrypted = ccipher.decrypt(encrypted);

        System.out.println("Original:  " + message);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
