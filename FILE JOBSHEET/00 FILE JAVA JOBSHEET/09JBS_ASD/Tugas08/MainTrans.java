package Tugas08;

import java.util.Scanner;

public class MainTrans {
    public static void main(String[] args) {
        // Membuat stack untuk menyimpan data struk belanja
        TransStack stack = new TransStack();

        // Memasukkan data struk belanja ke dalam stack
        stack.push(new Trans(1, "01-01-2024", 5, 150000));
        stack.push(new Trans(2, "05-01-2024", 3, 90000));
        stack.push(new Trans(3, "10-01-2024", 2, 60000));
        stack.push(new Trans(4, "15-01-2024", 4, 120000));
        stack.push(new Trans(5, "20-01-2024", 6, 180000));
        stack.push(new Trans(6, "25-01-2024", 7, 210000));
        stack.push(new Trans(7, "30-01-2024", 1, 30000));
        stack.push(new Trans(8, "03-02-2024", 2, 60000));

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan informasi struk belanja yang masih tersimpan");
            System.out.println("2. Ambil lima struk belanja untuk ditukarkan dengan voucher");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Informasi struk belanja yang masih tersimpan di dalam stack:");
                    stack.display();
                    break;
                case 2:
                    System.out.println("Mengambil lima struk belanja untuk ditukarkan dengan voucher:");
                    for (int i = 0; i < 5; i++) {
                        Trans strukBelanja = stack.pop();
                        if (strukBelanja != null) {
                            System.out.println("Struk belanja yang diambil:");
                            strukBelanja.CetakTrans();
                            System.out.println();
                        }
                    }
                    break;
                case 3:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
                    break;
            }
        } while (option != 3);

        scanner.close();
    }
}
