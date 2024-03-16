package minggu5;

import java.util.Scanner;

public class AkarKuadratDC {

    public static int akarKuadrat(int bilangan) {
        int batasBawah = 0;
        int batasAtas = bilangan;

        while (batasBawah <= batasAtas) {
            int tengah = (batasBawah + batasAtas) / 2;
            if (tengah * tengah == bilangan)
                return tengah;
            else if (tengah * tengah > bilangan)
                batasAtas = tengah - 1;
            else
                batasBawah = tengah + 1;
        }

        return batasAtas;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int bilangan = scanner.nextInt();
        scanner.close();

        int akar = akarKuadrat(bilangan);
        System.out.println("Akar dari " + bilangan + " adalah: " + akar);
    }
}
