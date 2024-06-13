package UAS04;

import java.util.Scanner;

public class SLL04Main {
    public static void main(String[] args) {
        SLL04 sll = new SLL04();
        Scanner sc = new Scanner(System.in);
        int menu;

        kendaraan04 kendaraan = new kendaraan04(111, "Atsilah", 2, 250, "2023", 2);
        sll.addFirst(kendaraan);
        kendaraan = new kendaraan04(222, "Afifah", 2, 100, "2005", 2);
        sll.addLast(kendaraan);
        kendaraan = new kendaraan04(333, "Luis", 2, 200, "2006", 2);
        sll.addLast(kendaraan);
        kendaraan = new kendaraan04(445, "Dewik", 4, 1000, "2004", 2);
        sll.addFirst(kendaraan);
        kendaraan = new kendaraan04(554, "Valina", 4, 2500, "2003", 2);
        sll.addLast(kendaraan);
        kendaraan = new kendaraan04(665, "Alpi", 4, 3000, "2009", 2);
        sll.addLast(kendaraan);

        do {
            System.out.println("=========================================");
            System.out.println("         SAMSAT POLRES PASURUAN          ");
            System.out.println("=========================================");
            System.out.println("1. Daftar Kendaraan");
            System.out.println("2. Bayar Pajak");
            System.out.println("3. Tampilkan Seluruh Transaksi");
            System.out.println("4. Urutkan Transaksi Berdasarkan Nama Pemilik");
            System.out.println("5. Keluar");
            System.out.print("Input Nomor\t\t: ");
            menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1:
                    System.out.println("=====================================");
                    System.out.println("\t\tDAFTAR KENDARAAN");
                    System.out.println("=====================================");
                    sll.print();
                    break;
                case 2:
                    System.out.println("=====================================");
                    System.out.println("\t\tBAYAR PAJAK");
                    System.out.println("=====================================");
                    System.out.print("Masukkan TNKB\t\t: ");
                    int tnkb = sc.nextInt();
                    // sc.next(); 
                    // sc.nextLine();
                    boolean success = sll.denda(tnkb);
                    if (success) {
                        System.out.println("Pembayaran pajak berhasil!");
                    } else {
                        System.out.println("TNKB tidak ditemukan, silakan coba lagi.");
                    }
                    break;
                case 3:
                    System.out.println("=====================================");
                    System.out.println("\t\tSELURUH TRANSAKSI");
                    System.out.println("=====================================");
                    sll.printTrfPajak();
                    System.out.println("Total Pendapatan " + sll.totalAkhir);
                    break;
                case 4:
                    System.out.println("=====================================");
                    System.out.println("\tURUTKAN TRANSAKSI BERDASARKAN NAMA PEMILIK");
                    System.out.println("=====================================");
                    sll.sortByName();
                    sll.print();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (menu != 5);
    }
}
