package Pattern;
import java.util.Scanner;

public class CharPyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print increasing characters
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            ch--;

            // Print decreasing characters
            for (int j = 2; j <= i; j++) {
                ch--;
                System.out.print(ch);
            }

            System.out.println();
        }

    }
}