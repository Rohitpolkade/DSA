package Pattern;
import java.util.Scanner;

public class PalindromicPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numb of Rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // decreasing numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // increasing numbers
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

    }
}