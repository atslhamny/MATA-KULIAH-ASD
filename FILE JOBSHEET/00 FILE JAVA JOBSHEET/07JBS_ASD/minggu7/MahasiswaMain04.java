package minggu7;

import java.util.Scanner;

public class MahasiswaMain04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs04 data = new PencarianMhs04();
        System.out.print("Masukkan jumlah data Mahasiswa : ");
        int jmlMhs = s.nextInt();
        Mahasiswa04[] inputan = new Mahasiswa04[jmlMhs];
        data.listMhs = inputan;

        System.out.println("--------------------------------------------------------------");
        System.out.println("Masukkan data mahasiswa secara urut dari nim terkecil : ");
        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("-----------------");
            System.out.print("Nim\t: ");
            int nim = s.nextInt();
            System.out.print("Nama\t: ");
            String nama = sl.nextLine();
            System.out.print("Umur\t: ");
            int umur = s.nextInt();
            System.out.print("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa04 m = new Mahasiswa04(nim, nama, umur, ipk);
            data.tambah(m);

        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("data keseluruhan mahasiswa: ");
        data.tampil();

        //
        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Pencarian data: ");
        System.out.println("Masukan NIM Mahasiswa yang dicari: ");
        System.out.print("NIM: ");
        int cari = s.nextInt();
        System.out.println("menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);

        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("================================");
        System.out.println("menggunakan binary search");
        posisi = data.FinBinarySearch(cari, 0, jmlMhs - 1);

        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("================================");
        System.out.println("menggunakan binary search descending");
        posisi = data.FinBinarySearchDesc(cari, 0, jmlMhs - 1);

        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

    }
}
