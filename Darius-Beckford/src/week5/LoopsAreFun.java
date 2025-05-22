package week5;

public class LoopsAreFun {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i + " " + j);
                for (int k = 0; k < 5; k++) {
                    System.out.println(i + " " + j + " " + k);
                    if (k == 3) {
                        break;
                    }
                }
            }
        }
    }
}
