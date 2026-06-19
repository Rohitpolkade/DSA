package Pattern;
import java.util.Scanner;

public class SolidRhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numb of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}