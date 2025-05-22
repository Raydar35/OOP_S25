package week6;

public class AtbashCipher implements BaseCipher {
    public AtbashCipher() {

    }

    @Override
    public String encrypt(String message) {
        return transform(message);
    }

    @Override
    public String decrypt(String message) {
        return transform(message);
    }

    private String transform(String message) {
        StringBuilder transformedMessage = new StringBuilder();

        for (char c : message.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                char transformedChar = (char) ('Z' - (c - 'A'));
                transformedMessage.append(transformedChar);
            } else {
                transformedMessage.append(c);
            }
        }
        return transformedMessage.toString();
    }

    public static void main(String [] args) {
        AtbashCipher ccipher = new AtbashCipher();

        String message = "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";
        String encrypted = ccipher.encrypt(message);
        String decrypted = ccipher.decrypt(encrypted);

        System.out.println("Original:  " + message);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }
}
