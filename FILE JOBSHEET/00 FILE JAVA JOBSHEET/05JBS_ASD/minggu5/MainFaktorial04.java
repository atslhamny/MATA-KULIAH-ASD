package minggu5;

import java.util.Scanner;

public class MainFaktorial04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long awal = System.currentTimeMillis();
        System.out.println("Waktu awal : " + String.valueOf(awal) + " milidetik");
        System.out.println("============================================");
        System.out.print("Masukkan Jumlah Elemen yang akan dihitung : ");
        int elemen = sc.nextInt();

        Faktorial04[] fk = new Faktorial04[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial04();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " : ");
            fk[i].nilai = sc.nextInt();
        }
        System.out.println("======================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("======================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
        }
        System.out.println("======================================");
        long akhir = System.currentTimeMillis();
        System.out.println("Waktu Akhir\t: " + String.valueOf(akhir) + " milidetik");

        long elapsTime = akhir - awal;
        System.out.println("Interval Waktu\t: " + String.valueOf(elapsTime) + " milidetik");
    }
}
