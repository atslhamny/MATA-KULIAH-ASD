package PRAKTIKUM2;
import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih Menu: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek Antrian Terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian Paling Belakang");
        System.out.println("6. Keluar");

        System.out.print("Masukkan Kapasitas Queue: ");
        int kapasitas = input.nextInt();
        Queue04 queue = new Queue04(kapasitas);

        int pilih;
        do {
            System.out.println("------------------------");
            System.out.print("Masukkan Operasi yang diinginkan: ");
            pilih = input.nextInt();
            input.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Norek: ");
                    String norek = input.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan Alamat: ");
                    String alamat = input.nextLine();
                    System.out.print("Masukkan Saldo: ");
                    int saldo = input.nextInt();
                    System.out.print("Masukkan Umur: ");
                    int umur = input.nextInt();
                    Nasabah04 data = new Nasabah04(norek, nama, saldo, umur, alamat);
                    queue.enqueue(data);
                    break;
                case 2:
                    Nasabah04 dt = queue.dequeue();
                    if (!"".equals(dt.norek) && !"".equals(dt.nama) && !"".equals(dt.alamat)
                    && dt.saldo != 0 && dt.umur != 0) {
                        System.out.println("Antrian yang keluar: " + dt.norek + " - " + dt.nama 
                        + " - " + dt.saldo + " - " + dt.umur + " - " + dt.alamat);
                        break;
                    } 
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.print();
                    break;
                case 5:
                    queue.peekRear();
                    break;
                case 6:
                    System.out.println("Terima kasih");
                    System.exit(0);
                default:
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
