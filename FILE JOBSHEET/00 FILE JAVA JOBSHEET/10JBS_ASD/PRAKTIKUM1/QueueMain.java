package PRAKTIKUM1;

import java.util.Scanner;

/**
 * QueueMain
 */
public class QueueMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Exit");
        System.out.println("------------------------");

        System.out.print("Masukkan Kapasitas Queue: ");
        int kapasitas = sc.nextInt();
        Queue04 queue = new Queue04(kapasitas);
       

        int pilih;
        do {
            System.out.println("------------------------");
            System.out.print("Masukkan Operasi yang diinginkan: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Data Baru: ");
                    int dataMasuk = sc.nextInt();
                    queue.enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = queue.dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang keluar: " + dataKeluar);
                        break;
                    }
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.peek();
                    break;
                case 5:
                    queue.clear();
                    break;
                case 6:
                    System.out.println("Terimakasih");
                    sc.close();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}

