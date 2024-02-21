import java.util.Scanner;

public class Assignment2_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menghitung Kecepatan, Jarak, dan Waktu");
        System.out.println("==============================================");

        while (true) {
            System.out.println("Pilih rumus yang ingin dihitung:");
            System.out.println("1. Kecepatan");
            System.out.println("2. Jarak");
            System.out.println("3. Waktu");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();

            if (pilihan == 0) {
                System.out.println("program selesai.");
                break;
            }
            //PUNYA ATSILAH GAMAW TAU

            switch (pilihan) {
                case 1:
                    htgKecepatan();
                    break;
                case 2:
                    htgJarak();
                    break;
                case 3:
                    htgWaktu();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        }
    }

    public static void htgKecepatan() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMenghitung Kecepatan");
        System.out.println("=====================");
        System.out.print("Masukkan jarak (s): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = input.nextDouble();
        double kecepatan = jarak / waktu;
        System.out.println("Kecepatan (v) = " + kecepatan);
    }

    //PUNYA ATSILAH INI BU TIDAK BOHONG
    public static void htgJarak() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMenghitung Jarak");
        System.out.println("=================");
        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = input.nextDouble();
        System.out.print("Masukkan waktu (t): ");
        double waktu = input.nextDouble();
        double jarak = kecepatan * waktu;
        System.out.println("Jarak (s) = " + jarak);
    }

    public static void htgWaktu() {
        Scanner input = new Scanner(System.in);
        System.out.println("\nMenghitung Waktu");
        System.out.println("=================");
        System.out.print("Masukkan jarak (s): ");
        double jarak = input.nextDouble();
        System.out.print("Masukkan kecepatan (v): ");
        double kecepatan = input.nextDouble();
        double waktu = jarak / kecepatan;
        System.out.println("Waktu (t) = " + waktu);
    }
}
