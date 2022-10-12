import java.util.Scanner;
public class ThreeDigitCodes {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                for (int k = 1; k <= 4; k++) {
                    if (k != i && k != j && i != j) {
                        total++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }
        System.out.println("Total number of the three-digit-number is " + total);
    }
}

