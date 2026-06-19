package Pattern;
import java.util.Scanner;

public class ConcentricSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                int right = size - 1 - j;
                int bottom = size - 1 - i;
                int num = n - Math.min( Math.min(i, bottom), Math.min(j, right));

                System.out.print(num + " ");
            }
            System.out.println();
        }

    }
}