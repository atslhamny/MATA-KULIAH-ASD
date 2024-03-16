package minggu5;

import java.util.Scanner;

public class AkarKuadratBF {

    public static int bruteForceSquareRoot(int n) {
        int result = 0;
        for (int i = 0; i * i <= n; i++) {
            result = i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int number = scanner.nextInt();
        scanner.close();

        int squareRoot = bruteForceSquareRoot(number);
        System.out.println("Akar dari " + number + " adalah: " + squareRoot);
    }
}
