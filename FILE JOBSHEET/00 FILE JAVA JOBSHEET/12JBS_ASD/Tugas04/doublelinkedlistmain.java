package Tugas04;

import java.util.Scanner;
public class doublelinkedlistmain {
    
    public static void menu() {
        System.out.println("===========================");
        System.out.println("PENGANTRI VAKSIN POLINEMA");
        System.out.println("===========================");
        System.out.println(" 1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);

        doubleLinkedlist dll = new doubleLinkedlist();

        int pilih;
        do {
            menu();
            System.out.print("Masukkan Menu yang dipilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nomor Antrian\t: ");
                    int nim = sd.nextInt();
                    System.out.print("Nama Penerima\t: ");
                    String nama = sc.nextLine();
                    dll.addLast(nim, nama);
                    break;

                case 2:
                    dll.removeFirst();
                    dll.print();
                    break;

                case 3:
                    dll.print();
                    break;

                case 4:
                    System.exit(0);
                    break;

            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4);
    }
}