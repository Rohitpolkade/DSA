package Pattern;
import java.util.Scanner;

public class HollowDiamondBox {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int initialSpace = 0;

        // Upper half
        for (int i = 0; i < n; i++) {

            // Left stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 0; j < initialSpace; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }

            initialSpace += 2;
            System.out.println();
        }

        initialSpace = 2 * (n - 1);

        // Lower half
        for (int i = 1; i <= n; i++) {

            // Left stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Middle spaces
            for (int j = 0; j < initialSpace; j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            initialSpace -= 2;
            System.out.println();
        }

    }
}