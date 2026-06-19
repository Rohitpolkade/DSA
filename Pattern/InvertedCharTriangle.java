package Pattern;
import java.util.Scanner;

public class InvertedCharTriangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Numb of Rows: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            char ch = (char) (69 - i);
            for (char j = ch; j <= 'E'; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

    }
}