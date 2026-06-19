package Pattern;
import java.util.Scanner;

public class HollowRhombus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numb of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // Outer spaces
            int spaces = n - i;
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // Hollow Rhombus
            for (int j = 1; j <= n; j++) {
                if (i != 1 && j != 1 && i != n && j != n) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}