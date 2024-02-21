import java.util.Scanner;

public class Perulangan04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input NIM: ");
        String nim = scanner.nextLine();

        // Ambil dua digit terakhir dari NIM
        int n = 0;
        int length = nim.length();
        if (length >= 2) {
            n = (nim.charAt(length - 2) - '0') * 10 + (nim.charAt(length - 1) - '0');
        } else {
            n = Integer.parseInt(nim);
        }

        // Jika n kurang dari 10, tambahkan 10
        if (n < 10) {
            n += 10;
        }

        // Tampilkan deretan bilangan dari 1 sampai n kecuali angka 6 dan 10
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // Lewati angka 6 dan 10
            }
            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
    }
}
