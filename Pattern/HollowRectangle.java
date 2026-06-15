package Pattern;
import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        // Print hollow rectangle
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {

                // Border positions -> print *
                if (i == 1 || j == 1 || i == rows || j == cols) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}